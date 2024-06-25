package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysFunctionality {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		WebElement dd=driver.findElement(By.id("searchDropdownBox"));
		dd.sendKeys(Keys.DOWN);
		dd.sendKeys(Keys.DOWN);
		dd.sendKeys(Keys.DOWN);
		dd.sendKeys(Keys.DOWN);
		dd.sendKeys(Keys.DOWN);
	}

}
