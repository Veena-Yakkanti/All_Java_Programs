package testpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Scenario3Assertion 
{
	public class Scenario3 
	{
		@Test
		public void Third() throws InterruptedException 
		{
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));

		
			WebElement search =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	        search.sendKeys("mouse");
	        search.sendKeys(Keys.ENTER);
	        WebElement sort=driver.findElement(By.linkText("Get It in 2 Days"));
	        sort.click();
	        Thread.sleep(700);
	        Assert.assertEquals(sort.isSelected(), true, "sorry actual not matched with expected");

	        
	        WebElement mouse=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]"));
	        mouse.click();
	        
			
		}
	}
}
