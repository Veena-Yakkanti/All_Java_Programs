package Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenario10 extends LaunchandQuit
{
	@Test
	public void scenario10() 
	{
		 WebElement search =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	        search.sendKeys("shoes");
	        search.sendKeys(Keys.ENTER);

			WebElement home =driver.findElement(By.id("nav-logo-sprites"));
	        home.click();
		
	}

}
