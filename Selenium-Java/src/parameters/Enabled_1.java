package parameters;

import org.testng.annotations.Test;

public class Enabled_1 
{
	@Test(priority=1)
	public void registration()
	{
		
	}
	@Test(priority=2)
	public void login()
	{
		
	}
	@Test(enabled=false) //like commenting in java we had only enabled =true and enabled=false there are no parameters with disable
	public void logout()
	{
		
	}

}
