package Demo;

public class ThisCalling_1
{
	ThisCalling_1()
    {
    	this(100);//this will call the parameterized(int) constructor 
    	System.out.println("1");
    }
     ThisCalling_1(int a)
    {
    	this("veena");//this will call the parameterized(String) constructor 
    	System.out.println("2");
    }
    ThisCalling_1(String b)
    {
    	System.out.println("3");
    }
	public static void main(String[] args) 
	{
		Thiscalling n1=new Thiscalling();//this will call the non parameterized constructor 
		System.out.println("4");

	}

}
