package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario6Assertion 
{
	@Test
	public void scenario6()
	{
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement electronics=driver.findElement(By.linkText(" Electronics "));
		electronics.click();

		WebElement Brand=driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base a-text-bold'])[5]"));
		Brand.click();

		WebElement sort=driver.findElement(By.linkText("Redmi"));
        sort.click();
		Assert.assertEquals(sort.isDisplayed(), true,"Scenario 6 failed!");

	}


}
