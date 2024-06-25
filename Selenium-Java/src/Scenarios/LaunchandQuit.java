package Scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LaunchandQuit 
{
	WebDriver driver;
	
	@BeforeMethod
	@Parameters("browser")
	public void Launch(String browserName)
	{
		if(browserName.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		if(browserName.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		if(browserName.equals("firefox"))
		{
			driver=new FirefoxDriver();
		
		}
		
		 driver.get("https://www.amazon.in/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25000));
			driver.manage().window().maximize();
	}
  @AfterMethod
  @Parameters("browser")
	  public void quit(String browserName)
		{
			if(browserName.equals("chrome"))
			{
				driver=new ChromeDriver();
			}
			if(browserName.equals("edge"))
			{
				driver=new EdgeDriver();
			}
			if(browserName.equals("firefox"))
			{
				driver=new FirefoxDriver();
			
			}
	  driver.quit();
	  
  }

}
