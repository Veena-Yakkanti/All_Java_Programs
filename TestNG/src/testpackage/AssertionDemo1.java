package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo1 
{
@Test
public void case1()
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fcss%2Fhomepage.html%3Ffrom%3Dhz%26ref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver.manage().window().maximize();
	WebElement un=driver.findElement(By.id("ap_email"));
    un.sendKeys("veenayakkanti@gmail.com");
    WebElement un_continue=driver.findElement(By.id("continue"));
    un_continue.click();
    WebElement password=driver.findElement(By.id("ap_password"));
    password.sendKeys("Vee@2627");
    WebElement signin=driver.findElement(By.id("signInSubmit"));
    signin.click();
    WebElement search =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    search.sendKeys("shoes");
    Assert.assertEquals(search.isDisplayed(), true, "Thanks");

    WebElement search_submit =driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
    search_submit.click();
}
}
