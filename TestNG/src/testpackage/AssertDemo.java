package testpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo 
{
   @Test
   public void test1() throws InterruptedException
   
   {
	   ChromeDriver driver=new ChromeDriver();
		//EdgeDriver driver1=new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		//WebDriverWait v11=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("India");
		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		Thread.sleep(600);
		Assert.assertEquals(driver.getTitle(), "india - Google Search", "Thanks");

	   
   }
}
