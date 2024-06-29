package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario10Assertion 
{

	@Test
	public void scenario10() 
	{
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement search =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	    search.sendKeys("shoes");
	    search.sendKeys(Keys.ENTER);

	    WebElement home =driver.findElement(By.id("nav-logo-sprites"));
	    home.click();
	    Assert.assertEquals(home.isDisplayed(), true, "Sorry scenario10 failed");
		
	}

}
