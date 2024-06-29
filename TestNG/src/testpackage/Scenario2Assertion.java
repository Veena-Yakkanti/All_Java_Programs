package testpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Scenarios.LaunchandQuit;

public class Scenario2Assertion 
{
	public class case2
	{
		@Test
		public void Second()
		{
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));

			WebElement search =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	        search.sendKeys("mobile");
	        
	        search.sendKeys(Keys.ENTER);
	        WebElement mobile=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]"));
	        mobile.click();
	        Assert.assertEquals(mobile.isEnabled(), true, "Sorry actual value is not matched with expected value");
	       
		}

	}
}
