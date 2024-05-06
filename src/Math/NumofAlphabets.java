package Math;
import java.util.Arrays;
public class NumofAlphabets 
{
	static int countofalpha=0;
	public static void main(String[] args)
	{
		String name="SHREYAS";
		char [] c1=name.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i=0;i<c1.length;i++)
		{
		boolean answer=Character.isAlphabetic(c1[i]);
	  if(answer==true)
	  {
	   countofalpha++;
	  }
		}
		 System.out.println(countofalpha++);
	}
	

}
