package Scenarios;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenario1 extends LaunchandQuit
{
	@Test
	
	public void First()
	{  
		 WebElement search =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	        search.sendKeys("shoes");
	       // WebElement search_submit =driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	        search.sendKeys(Keys.ENTER);
			WebElement shoe=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		    shoe.click();
		    
		   /* Set<String> s1=driver.getWindowHandles();
		    System.out.println(s1);
		    Iterator<String> pcid= s1.iterator();
		    String parentid=pcid.next();
		    String childid=pcid.next();
		    System.out.println(parentid);
		    System.out.println(childid);
		    driver.switchTo().window(childid);*/
		
	}

}
