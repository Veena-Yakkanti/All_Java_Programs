package Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenario6 extends LaunchandQuit
{
	@Test
	public void scenario6()
	{
		WebElement electronics=driver.findElement(By.linkText(" Electronics "));
		electronics.click();

		//WebElement Brand=driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base a-text-bold'])[5]"));
		//Brand.click();

		WebElement sort=driver.findElement(By.linkText("Redmi"));
        sort.click();
	}

}
