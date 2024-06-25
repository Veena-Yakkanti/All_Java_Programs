package SeleniumBasic;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class AutoSuggestion {
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
	    WebElement search=driver.findElement(By.xpath("//input[@div='twotabsearchtextbox']"));
		search.sendKeys("shoes");
		Thread.sleep(3000);
		List <WebElement> auto = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
        int count= auto.size();
        auto.get(5).click();	
	}
}
