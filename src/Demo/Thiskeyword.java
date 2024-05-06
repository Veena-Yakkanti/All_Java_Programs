package Demo;
public class Thiskeyword 
{
	int age;
	String name;
    double salary;
	void details(int age,String name,double salary)
	{
		this.age=age;
		this.name=name;
		this.salary=salary;
	}
	public static void main(String[] args)
	{
		
		Thiskeyword n1=new Thiskeyword();
		n1.details(29, "veena", 89.98);
		System.out.println(n1.age);
		System.out.println(n1.name);
		System.out.println(n1.salary);	
		

	}

}
