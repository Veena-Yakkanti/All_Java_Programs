package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoverover {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		WebElement fashions=driver.findElement(By.xpath("(//span[.='Fashion'])[1]"));
		Actions a1=new Actions(driver);
		a1.moveToElement(fashions).perform();
		WebElement men=driver.findElement(By.linkText("Men's T-Shirts"));
		men.click();
		//System.out.println(driver.getTitle());
		//driver.close();)
		
	}	
}
