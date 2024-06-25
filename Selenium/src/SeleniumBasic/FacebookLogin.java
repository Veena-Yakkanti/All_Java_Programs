package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FacebookLogin {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	    driver.findElement(By.id("email")).sendKeys("veenayakkanti@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("e@2627");
	    driver.findElement(By.name("login")).click();	

	}

}
