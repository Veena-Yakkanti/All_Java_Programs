package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scenario5Assertion 
{
	@Test
	public void scenario5() 
	{
       ChromeDriver driver=new ChromeDriver();
       driver.get("https://www.amazon.in");
	   driver.manage().window().maximize();
		WebElement search =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        search.sendKeys("camera");
        search.sendKeys(Keys.ENTER);
	    WebElement nextpage1=driver.findElement(By.cssSelector("[aria-label='Go to page 3']"));
	    nextpage1.click();
	    WebElement camera=driver.findElement(By.partialLinkText("BLACKPOOL 4K Action Camera with Accessories Kit | WiFi | 16 MP | 170 Degree Wide Angle Lens | 30m Underwater Waterproof Underwater Camera for YouTube Vlogging, Bike Helmet Motovlogging & Travel Vlog"));
	    camera.click();


	}
}
