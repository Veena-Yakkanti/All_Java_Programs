package skip;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Skip_Testcase 
{
	@Test
	public void login()
	{
		Assert.assertTrue(false);
	}
	@Test(dependsOnMethods="login")
	public void logout() 
	{
		
	}

}
