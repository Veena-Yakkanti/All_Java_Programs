package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail_login {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		gmail.click();
		WebElement signin=driver.findElement(By.linkText("Sign in"));
		signin.click();			

	}

}
