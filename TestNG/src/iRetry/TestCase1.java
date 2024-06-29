package iRetry;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 
{
	@Test(retryAnalyzer=iRetry.Retry_Logic.class)
	public void case1()
	{
		
	
	ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));

	 WebElement search =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        search.sendKeys("shoes");
        Assert.assertEquals(search.isDisplayed(), true, "sorry");
       // WebElement search_submit =driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        search.sendKeys(Keys.ENTER);
		WebElement shoe=driver.findElement(By.xpath("(aa//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
	    shoe.click();
}
}
