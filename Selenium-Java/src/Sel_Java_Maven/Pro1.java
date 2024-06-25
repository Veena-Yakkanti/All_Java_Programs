package Sel_Java_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pro1 
{
	@Test
	public static void signin()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Damazon%2Bprime%26adgrpid%3D1322714101714665%26hvadid%3D82669897711050%26hvbmt%3Dbb%26hvdev%3Dc%26hvlocphy%3D149083%26hvnetw%3Do%26hvqmt%3Db%26hvtargid%3Dkwd-82670518517893%253Aloc-90%26hydadcr%3D5621_2377279%26msclkid%3Def15c1be4254109a44a1a7df28bedd90%26tag%3Dmsndeskstdin-21%26ref%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");	
		driver.manage().window().maximize();
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("veena@gmail.com");
		WebElement cont=driver.findElement(By.id("continue"));
		cont.click();
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("gasyh13u");
		WebElement signin=driver.findElement(By.id("signInSubmit"));
		signin.click();	
	}
}
