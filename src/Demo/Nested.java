package Demo;
public class Nested
{
	public static void main(String[] args)
	{
		int a=19;
		int b=22;
		int c=19;
		if(a==c)
		{
			if(b<c)
			{
				System.out.println("1");
			}
			else
			{
				System.out.println("2");
			}
		}
		else
		{
			System.out.println("3");
		}
	}
}
