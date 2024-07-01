package iRetry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Logic implements IRetryAnalyzer
{
     int initial_count=0;
     int retry_times=6;
	@Override
	public boolean retry(ITestResult result) 
	{
		// TODO Auto-generated method stub
		while(initial_count<retry_times)
		{
			initial_count++;
			return true;
		}
		
		return false;
	}

}
