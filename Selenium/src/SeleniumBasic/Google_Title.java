package SeleniumBasic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Title
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String title =driver.getTitle();
		System.out.println(title);	

	}

}
