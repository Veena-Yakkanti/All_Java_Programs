package parameters;

import org.testng.annotations.Test;

public class InvocationCount 
{
	@Test
	public void registration()
	{
		
	}
	@Test(invocationCount=4)
	public void login()
	{
		
	}
	

}
