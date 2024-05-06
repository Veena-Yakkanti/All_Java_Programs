package Array;
class Exencapsulation
{
	private int age=18;

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}
}
public class Encapsulation 
{

	public static void main(String[] args) 
	{
		Exencapsulation a1=new Exencapsulation();
		a1.setAge(32);
		System.out.println(a1.getAge());
	}

}
