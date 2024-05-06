package Array;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TryCatch 
{
	public static void main(String[] args) 
	{
	  Scanner s1=new Scanner(System.in);
	  int n1= s1.nextInt();
	  String[] name= new String[n1];
	try  {
	  
	  name[0]="Ram";
	  System.out.println(name);
	      }
	finally
	{
		
	}
	try {	  
	  name[1]="Sita";
	  System.out.println(name);
	       }
	finally
	{
		
	}
    try  
    {
		 
	  name[2]="Laxman";
	  System.out.println(name);
	 } 
    finally
    {
    	
    }
    try 
    {	 
	  name[3]="Hanuman";
	  System.out.println(name);
	 }
	catch(InputMismatchException a1)
	{
		System.out.println("Exception1");
	}
	catch(NullPointerException a2)
	{
		System.out.println("Exception2");
	}
	catch(IndexOutOfBoundsException a3)
	{
		System.out.println("Exception2");
	}
}

}
	