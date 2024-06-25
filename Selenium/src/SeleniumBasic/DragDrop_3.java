package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop_3 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement drag=driver.findElement(By.id("drag6"));
		WebElement drop=driver.findElement(By.id("div2"));
		Thread.sleep(3000);
		WebElement drag1=driver.findElement(By.id("div2"));
		WebElement drop1=driver.findElement(By.id("drag6"));
		Actions a1=new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();
		a1.dragAndDrop(drag1, drop1).perform();
		
	}

}
