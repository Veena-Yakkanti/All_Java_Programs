package Math;
import java.util.Arrays;
import java.util.Scanner;
public class Arrayequals 
{
	public static void main(String[] args)//main method
	{
		 System.out.println("Staring of first array");
		Scanner s1=new Scanner(System.in);
		int age[]=new int[3];
		for(int i=0;i<age.length;i++)
		{
			System.out.println("Enter the array"+i);
			age[i]=s1.nextInt();		
		}
		 System.out.println("Starting of second array");
		int age1[]=new int[3];
		for(int i=0;i<age1.length;i++)
		{
			System.out.println("Enter the array"+i);
			age1[i]=s1.nextInt();		
		}
     System.out.println(Arrays.toString(age));
     System.out.println(Arrays.toString(age1));
     if(Arrays.equals(age, age1)==true)
     {
    	 System.out.println("Arrays are equal");
     }
     else
     {
    	 System.out.println("sorry arrays are not equals");
     }
}
}