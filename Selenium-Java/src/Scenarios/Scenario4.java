package Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenario4 extends LaunchandQuit
{
	@Test
	public void scenario4()
	{
		WebElement search =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        search.sendKeys("mobile cover");
        search.sendKeys(Keys.ENTER);
        WebElement sort=driver.findElement(By.linkText("Include Out of Stock"));
        sort.click();
		
	}

}
