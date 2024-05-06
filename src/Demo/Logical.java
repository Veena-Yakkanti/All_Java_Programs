package Demo;
class Logical 
{
	public static void main(String[] args) 
	{
	int a=10;
	int b=20;
	if(a>6 || b==a)
	{
		System.out.println("or operator");
	}
    if(a>6 && b!=a) 
    {
    	System.out.println("AND operator");
    }
    if(!(a==b)  || b!=a)
    {
    	System.out.println("OR with not operator");
    }
    if(!(a==b)  && b!=a)
    {
    	System.out.println("And with not operator");
    	
    }
	}
}
