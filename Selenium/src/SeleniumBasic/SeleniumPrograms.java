package SeleniumBasic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumPrograms {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//ChromeDriver driver=new ChromeDriver();
		EdgeDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println(driver.getWindowHandles());
		System.out.println(driver.getWindowHandle());	
	}

}
