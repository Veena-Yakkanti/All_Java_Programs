package Math;
import java.util.Arrays;
import java.util.Scanner;
public class Arrayequals_1 {
	public static void main(String[] args) 
	{
		 System.out.println("Staring of first array");
		Scanner s1=new Scanner(System.in);
		boolean percentage[]=new boolean[3];
		for(int i=0;i<percentage.length;i++)
		{
			System.out.println("Enter the array"+i);
			percentage[i]=s1.hasNextDouble();		
		}
		 System.out.println("Starting of second array");
		boolean percentage1[]=new boolean[3];
		for(int i=0;i<percentage1.length;i++)
		{
			System.out.println("Enter the array"+i);
			percentage1[i]=s1.hasNextDouble();		
		}
    System.out.println(Arrays.toString(percentage));
    System.out.println(Arrays.toString(percentage1));
    if(Arrays.equals(percentage, percentage1)==true)
    {
   	 System.out.println("Arrays are equal");
    }
    else
    {
   	 System.out.println("sorry arrays are not equals");
    }

	}

}
