package Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Scenario8 extends LaunchandQuit
{
	@Test
	public void scenario8()
	{
		WebElement dd =driver.findElement(By.name("url"));
        
     
		Select books=new Select(dd);
		books.selectByValue("search-alias=audible");
		WebElement search =driver.findElement(By.name("field-keywords"));
        search.sendKeys("power of mind");
        search.sendKeys(Keys.ENTER);
        WebElement powerofmind=driver.findElement(By.xpath("(//a[tabindex='-1'])[2]"));
	    powerofmind.click();
        
	}

}
