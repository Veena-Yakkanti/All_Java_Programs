package Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Scenario7 extends LaunchandQuit
{
	@Test
	public void scenario7() 
	{
		WebElement home =driver.findElement(By.id("nav-logo-sprites"));
        home.click();
        WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		Select s2=new Select(dropdown);
		s2.selectByVisibleText("Amazon Fresh");
		WebElement search =driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("mango");
        search.sendKeys(Keys.ENTER);
	}
		
	

}
