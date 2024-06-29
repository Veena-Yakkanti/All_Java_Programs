package testpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario4Assertion 
{
	@Test
	public void scenario4()
	{
		 ChromeDriver driver=new ChromeDriver();
		    driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));

		WebElement search =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        search.sendKeys("mobile cover");
        search.sendKeys(Keys.ENTER);
        WebElement sort=driver.findElement(By.linkText("Include Out of Stock"));
        sort.click();
        Assert.assertEquals(sort.isSelected(), true, "sorry both values not matched");
		
	}

}
