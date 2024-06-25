package Scenarios;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenario2 extends LaunchandQuit
{
	@Test
	public void Second()
	{
		WebElement search =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        search.sendKeys("mobile");
        
        search.sendKeys(Keys.ENTER);
        WebElement mobile=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]"));
        mobile.click();
       
	}

}
