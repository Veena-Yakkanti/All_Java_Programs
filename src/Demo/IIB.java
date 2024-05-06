package Demo;

public class IIB 
  {
	IIB()
	{
		System.out.println("constructor");
	}
	{
		System.out.println("IIB1");
	}
	{
		System.out.println("IIB2");
	}
	static
	{
		System.out.println("SIB1");
	}
	static
	{
		System.out.println("SIB2");
	}
	

	public static void main(String[] args) 
	{
		
		IIB n1=new IIB();
		IIB n2=new IIB();
		System.out.println("mainmethod");   


	}

}
