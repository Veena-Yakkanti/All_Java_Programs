package Inheritance;
class parent extends Supermost
{
	 static void add()
	{
		System.out.println("parent");
	}
}
public class Child1 extends parent
{
     static void sub()
    {
    	System.out.println("child");
    }
	public static void main(String[] args)
	{
	  /*Child1 c1=new Child1();
	  c1.sub();
	  c1.add();*/
		sub();
		add();
        mul();
	}

}
