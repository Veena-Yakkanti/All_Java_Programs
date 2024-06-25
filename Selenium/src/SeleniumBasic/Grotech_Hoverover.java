package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Grotech_Hoverover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/hoverover/");
		driver.manage().window().maximize();
		WebElement Demo1=driver.findElement(By.id("1857001"));
		Actions a1=new Actions(driver);
		a1.moveToElement(Demo1).perform();
		WebElement pract3=driver.findElement(By.linkText("Practice3"));
		
	}

}
