package Demo;

public class Constructor 
{
	Constructor()
	{
		System.out.println(1);		
	}
   Constructor(String Vee)
   {
	   System.out.println(2);
	   
   }
   Constructor(int v, int w, int u, long t, char z, long f, char o)
   {
	   System.out.println(3);
   }
   public static void main(String[] args)
   {
   Constructor n1=new Constructor();
   Constructor n2=new Constructor("Veena");
   Constructor n3=new Constructor(10,12,16, 879,'x', 908,'y');
   }
   
   }