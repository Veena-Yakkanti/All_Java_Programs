package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scenario9Assertion 
{
	@Test
	   public void scenario9()
	   {
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	    WebElement todaydeals=driver.findElement(By.linkText("Today's Deals"));
	    todaydeals.click();
	    WebElement dealofday=driver.findElement(By.xpath("(//li[@class='a-carousel-card'])[1]"));
	    dealofday.click();
	    WebElement product=driver.findElement(By.xpath("(//div[@class='ProductCard-module__imageWrapper_ytp7KTuzmF4mDTFCQLzr'])[1]"));
	    product.click();
	   }

}
