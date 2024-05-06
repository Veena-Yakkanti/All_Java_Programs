package Math;
import java.util.Scanner;
public class RuntimeArray 
{
	public static void main(String[] args) 
	{
   Scanner s1=new Scanner(System.in);
   int age[]=new int[4];
   for(int i=0;i<4;i++)
   {
	   System.out.println("Enter the array-->"+i);
	   age[i]= s1.nextInt();
	   System.out.println(age[i]);
   }
   
   

	}

}
