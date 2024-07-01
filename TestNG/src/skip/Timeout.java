package skip;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Timeout 
{
	@Test(timeOut=4000)
	public void Testcase1()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String title =driver.getTitle();
		System.out.println(title);	
	}

}
