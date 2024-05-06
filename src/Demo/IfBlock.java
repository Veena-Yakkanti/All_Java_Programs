package Demo;

public class IfBlock 
{
	public static void main(String[] args)
	{
		int a=12;
		int b=20;
		int c=30;
		if(a>b) 
		{
			System.out.println("a");
		}
		if (a<b)
		{
			System.out.println("b");
		}
		if(b!=c)
		{
			System.out.println("c");
		}
		if(c>=b)
		{
			System.out.println("d");
		}
		if(a<=c)
		{
			System.out.println("a&b");
		}
	}

}
