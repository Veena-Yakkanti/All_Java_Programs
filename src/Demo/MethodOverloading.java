package Demo;
public class MethodOverloading {
	void add()
	{
		int a=20;
		System.out.println(a+12);
	}
	void add (int a)
	{
		System.out.println(a+19);
	}
	static void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) 
	{
	add(100,30,89);
	MethodOverloading n1=new MethodOverloading();
	n1.add(18);
	n1.add();
	}
}
