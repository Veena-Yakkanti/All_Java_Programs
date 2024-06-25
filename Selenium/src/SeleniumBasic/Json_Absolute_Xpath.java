package SeleniumBasic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Json_Absolute_Xpath {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();		
        driver.get("file:///C:/Users/sambi/Downloads/learningHTML1.html");
        WebElement username=driver.findElement(By.xpath("/html/body/input[1]"));
        username.sendKeys("veenas");
        WebElement hint= driver.findElement(By.xpath("/html/body/input[2]"));
        hint.sendKeys("i am a music lover");
        WebElement password= driver.findElement(By.xpath("/html/body/input[3]"));
        password.sendKeys("12hgsu");
        WebElement firstname= driver.findElement(By.xpath("/html/body/form/input"));
        firstname.sendKeys("Vee");
        WebElement submit=driver.findElement(By.xpath("/html/body/form/input[1]"));
        submit.click();
        WebElement boy=driver.findElement(By.xpath("/html/body/form[2]/input[1]"));
        boy.click();
        WebElement girl=driver.findElement(By.xpath("/html/body/form[2]/input[2]"));
        girl.click();
        WebElement baby=driver.findElement(By.xpath("/html/body/form[2]/input[3]"));
        baby.click();
        WebElement submit1=driver.findElement(By.xpath("/html/body/form[2]/input[4]"));
        submit1.click();
        WebElement male=driver.findElement(By.xpath("/html/body/input[4]"));
        male.click();
        WebElement female=driver.findElement(By.xpath("/html/body/input[5]"));
        female.click();
        WebElement relocate=driver.findElement(By.xpath("/html/body/input[6]"));
        relocate.click();         
	}

}
