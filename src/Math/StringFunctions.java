package Math;
public class StringFunctions
{
	public static void main(String[] args) 
	{
	   String name="Difference";
	  System.out.println (name.length());
	  System.out.println(name.charAt(7));
	  System.out.println(name.indexOf('e'));
	  System.out.println(name.toLowerCase());
	  System.out.println(name.toUpperCase());
	  System.out.println(name.concat( " is nothing"));
	  String first_name="Veena";
	  String last_name="Madhuri";
	  System.out.println(first_name.concat (" ").concat(last_name));
	  System.out.println(name.contains("diff"));
	  System.out.println(name.contains("Diff"));   
	  String title="     I am here for you   ";
	  System.out.println(title.trim());
	  
	}			
}
