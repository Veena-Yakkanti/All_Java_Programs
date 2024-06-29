package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario7Assertion 
{
	@Test
	public void scenario7() 
	{
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement home =driver.findElement(By.id("nav-logo-sprites"));
        home.click();
        WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		Select s2=new Select(dropdown);
		s2.selectByVisibleText("Amazon Fresh");
		WebElement search =driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("mango");
        search.sendKeys(Keys.ENTER);
        Assert.assertEquals(driver.getTitle(), "Amazon.in : mango", " Sorry Scenario7 failed actaul result not matched with expected result");
	}

}
