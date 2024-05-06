package Demo;
class Veena
{
	void add()
	{
		int a=12;
		int b=10;
		System.out.println(a+b);
	}
}
public class SingleInheritance extends Veena
{
	static void sub()
	{
		int c=30;
		int d=20;
		System.out.println(d-c);		
	}
	public static void main(String[] args) 
	{
        SingleInheritance n1=new SingleInheritance();
        n1.add();
        sub();	
	}
}
