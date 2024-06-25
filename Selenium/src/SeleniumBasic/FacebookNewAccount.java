package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookNewAccount {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		WebElement name=driver.findElement(By.name("firstname"));
		name.sendKeys("veena");
		WebElement last_name=driver.findElement(By.name("lastname"));
		last_name.sendKeys("reddy");
		WebElement email=driver.findElement(By.name("reg_email__"));
		email.sendKeys("veeahj@gmail.com");
		WebElement password=driver.findElement(By.id("password_step_input"));
		password.sendKeys("56vyj89");
		WebElement day =driver.findElement(By.id("day"));
		Select s1=new Select(day);
		s1.selectByValue("25");
		WebElement month =driver.findElement(By.id("month"));
		Select s2=new Select(month);
		s2.selectByValue("02");
		WebElement year =driver.findElement(By.id("year"));
		Select s3=new Select(year);
		s3.selectByValue("2023");		
		WebElement submit=driver.findElement(By.name("websubmit"));
		submit.click();
	}
}
