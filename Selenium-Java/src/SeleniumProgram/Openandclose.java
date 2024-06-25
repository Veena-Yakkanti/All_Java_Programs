package SeleniumProgram;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.safari.SafariDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;

	public class Openandclose
	{
		EdgeDriver driver;
		@BeforeMethod
		public void Launch()
		{
			driver=new EdgeDriver();
			driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fcss%2Fhomepage.html%3Ffrom%3Dhz%26ref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
			driver.manage().window().maximize();
			WebElement un=driver.findElement(By.id("ap_email"));
	        un.sendKeys("veenayakkanti@gmail.com");
	        WebElement un_continue=driver.findElement(By.id("continue"));
	        un_continue.click();
	        WebElement password=driver.findElement(By.id("ap_password"));
	        password.sendKeys("Vee@2627");
	        WebElement signin=driver.findElement(By.id("signInSubmit"));
	        signin.click();
			
		}
	  @AfterMethod
	  public void quit()
	  {
		  WebElement accountandlist=driver.findElement(By.id("nav-link-accountList"));
	      Actions s2=new Actions(driver);
	      s2.moveToElement(accountandlist).perform();
	      WebElement signout=driver.findElement(By.id("nav-item-signout"));
	      signout.click();
		  
	  }

	}

