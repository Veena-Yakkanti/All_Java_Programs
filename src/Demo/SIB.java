package Demo;
public class SIB 
{
    static
    {
    	System.out.println("SIB");   	
    }
    static
    {
    	System.out.println("SIB1");
    }
    
    {
    	System.out.println("IIB");
    }
    {
    	System.out.println("IIB1");
    }
	public static void main(String[] args)
	{
		System.out.println("Main Method");
		SIB s1=new SIB();
		SIB s2=new SIB();
	}
}
