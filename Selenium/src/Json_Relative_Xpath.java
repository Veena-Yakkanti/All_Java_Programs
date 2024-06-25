import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Json_Relative_Xpath {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();		
        driver.get("file:///C:/Users/sambi/Downloads/learningHTML1.html");
        WebElement username=driver.findElement(By.xpath("(//input[@id='1'])"));
        username.sendKeys("veenas");
        WebElement hint= driver.findElement(By.xpath("(//input[@id='2'])"));
        hint.sendKeys("i am a music lover");
        WebElement password= driver.findElement(By.xpath("(//input[@id='3'])"));
        password.sendKeys("12hgsu");
        WebElement firstname= driver.findElement(By.xpath("(//input[@name='fname'])"));
        firstname.sendKeys("Vee");
        WebElement submit=driver.findElement(By.xpath("(//input[@value='Submit'])[1]"));
        submit.click();
        WebElement boy=driver.findElement(By.xpath("(//input[@id='123'])"));
        boy.click();
        WebElement girl=driver.findElement(By.xpath("(//input[@value='Girl'])"));
        girl.click();
        WebElement baby=driver.findElement(By.xpath("(//input[@id='321'])"));
        baby.click();
        WebElement submit1=driver.findElement(By.xpath("(//input[@value='Submit'])[2]"));
        submit1.click();
        WebElement male=driver.findElement(By.xpath("(//input)[11]"));
        male.click();
        WebElement female=driver.findElement(By.xpath("(//input)[12]"));
        female.click();
        WebElement relocate=driver.findElement(By.xpath("(//input)[13]"));
        relocate.click();       
        
		

	}

}
