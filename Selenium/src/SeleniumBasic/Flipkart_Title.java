package SeleniumBasic;

import org.openqa.selenium.edge.EdgeDriver;

public class Flipkart_Title
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		String title =driver.getTitle();
		System.out.println(title);			
	}

}
