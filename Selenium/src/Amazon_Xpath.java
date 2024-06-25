import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Amazon_Xpath 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
        driver.get("https://www.amazon.in");
        WebElement search =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        search.sendKeys("shoes");
        WebElement search_submit =driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        search_submit.click();
	}

}
