package Scenarios;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenario5 extends LaunchandQuit
{
	@Test
	public void scenario5() 
	{
		WebElement search =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        search.sendKeys("camera");
        search.sendKeys(Keys.ENTER);
	    WebElement nextpage1=driver.findElement(By.cssSelector("[aria-label='Go to page 3']"));
	    nextpage1.click();
	    WebElement camera=driver.findElement(By.partialLinkText("BLACKPOOL 4K Action Camera with Accessories Kit | WiFi | 16 MP | 170 Degree Wide Angle Lens | 30m Underwater Waterproof Underwater Camera for YouTube Vlogging, Bike Helmet Motovlogging & Travel Vlog"));
	    camera.click();
	    
	   
	
		
		
	}

}
