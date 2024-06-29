package testpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario8Assertion 
{
	@Test
	public void scenario8()
	{
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		WebElement dd =driver.findElement(By.name("url"));
        
     
		Select books=new Select(dd);
		books.selectByValue("search-alias=audible");
		WebElement search =driver.findElement(By.name("field-keywords"));
        search.sendKeys("power of mind");
        search.sendKeys(Keys.ENTER);
        WebElement powerofmind=driver.findElement(By.xpath("(//a[tabindex='-1'])[2]"));
	    powerofmind.click();
	    Assert.assertEquals(powerofmind.isDisplayed(), true, "Sorry it was failed");
        
	}

}
