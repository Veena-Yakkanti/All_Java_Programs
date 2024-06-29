package parameters;

import org.testng.annotations.Test;

public class InvocationCount_1 
{

	@Test
	public void registration()
	{
		
	}
	@Test(priority=1,invocationCount=4)
	public void login()
	{
		
	}
	

}
