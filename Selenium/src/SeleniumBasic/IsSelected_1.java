package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/is-selected/");
		driver.manage().window().maximize();
		WebElement w1=driver.findElement(By.linkText("CheckBox1"));
		WebElement w2=driver.findElement(By.linkText(" CheckBox8 "));
		WebElement w3=driver.findElement(By.linkText("CheckBox12"));
		WebElement w4=driver.findElement(By.linkText("CheckBox6"));
		WebElement w5=driver.findElement(By.linkText("CheckBox4"));
		WebElement w6=driver.findElement(By.linkText("CheckBox8"));
		w1.click();
		w2.click();
		w3.click();
		w4.click();
		w5.click();
		w6.click();
	}
}
