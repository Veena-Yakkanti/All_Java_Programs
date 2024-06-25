package SeleniumBasic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon_Title {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
	}

}
