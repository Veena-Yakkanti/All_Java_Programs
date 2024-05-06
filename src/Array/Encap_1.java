package Array;
class Vee
{
	private String name="Shreyu";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
public class Encap_1 
{
	public static void main(String[] args) 
	{
	   Vee n1=new Vee();
	   n1.setName("Sambu");
	   System.out.println(n1.getName());
	}

}
