package Array;
class Gp
{
	Gp(int a, int b)//Parametrized Constructor
	{
		System.out.println("Parent");
	}	
}
class Child extends Gp
{
	Child(int c)//Parametrized Constructor
	{
		super(100, 200);//Calling parametrized parent constructor which contains two parameters
		System.out.println("Child");
	}	
}
public class Supercalling extends Child
{
	Supercalling(int c)//Parametrized Constructor
	{
		super(200);//Calling parametrized parent constructor which contains one parameter
		System.out.println("Supercalling");	
	}
	public static void main(String[] args) 
	{
		new Supercalling(20);
	}
}
