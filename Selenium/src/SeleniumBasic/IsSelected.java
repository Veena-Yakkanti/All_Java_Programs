package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sambi/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement boy=driver.findElement(By.id("123"));
		boolean b1= boy.isSelected();
		//WebElement male=driver.findElement(By.linkText("Male"));
		//boolean b2=male.isSelected();
     	if(b1==true)
		{
			System.out.println("its selected");
			
		}
		else
		{
			System.out.println("its selected");

		}
     	
		boy.click();
		//male.click();
			

	}

}
