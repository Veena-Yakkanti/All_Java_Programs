package Inheritance;
class GrandParent_1
{
	static void add()
	{
		System.out.println("Grandparent");
	}
}
class Parent_1 extends GrandParent_1
{
	static void mul() 
	{
		System.out.println("Parent");
	}
}
class Child_1 extends Parent_1
{
	static void sub()
	{
		System.out.println("Child1");
	}
}

public class Hybrid extends GrandParent_1
{

	public static void main(String[] args) 
	{
		add();
		Parent_1.mul();
		Child_1.sub();
		

	}

}
