package Array;
class Parent
{
	
}
public class Downcasting extends Parent
{

	public static void main(String[] args) 
	{
		Parent p1=new Downcasting();//Upcasting
		Downcasting u1=(Downcasting)p1;//Downcasting
		//After done the upcasting then only we can do downcasting

	}

}
