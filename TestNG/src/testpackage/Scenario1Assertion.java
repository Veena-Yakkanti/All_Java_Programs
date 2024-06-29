package testpackage;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;


public class Scenario1Assertion 
{
@Test
	
	public void First()
	{  
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));

		 WebElement search =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	        search.sendKeys("shoes");
	        Assert.assertEquals(search.isDisplayed(), true, "sorry");
	       // WebElement search_submit =driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	        search.sendKeys(Keys.ENTER);
			WebElement shoe=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		    shoe.click();
		    
		    /*Set<String> s1=driver.getWindowHandles();
		    System.out.println(s1);
		    Iterator<String> pcid= s1.iterator();
		    String parentid=pcid.next();
		    String childid=pcid.next();
		    System.out.println(parentid);
		    System.out.println(childid);
		    driver.switchTo().window(childid);*/
		    

}
}