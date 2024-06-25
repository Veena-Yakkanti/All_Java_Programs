package Scenarios;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenario3 extends LaunchandQuit
{
	@Test
	public void Third() 
	{
		WebElement search =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        search.sendKeys("mouse");
        search.sendKeys(Keys.ENTER);
        WebElement sort=driver.findElement(By.linkText("Get It in 2 Days"));
        sort.click();
        
        WebElement mouse=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]"));
        mouse.click();
       
        
		
	}

}
