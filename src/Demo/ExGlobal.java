package Demo;

public class ExGlobal
 {
	int a=100;
	int b=20;
  void add() 
 {
	 System.out.println(a+b);
 }
  void sub()
 {
	 System.out.println(a-b);
	 
 }
  void mul()
  {
	  System.out.println(a*b);
  }
  void div()
  {
	  System.out.println(a/b);
	  
  }
  void mod()
  {
	  System.out.println(a%b);
  }
	public static void main(String[] args) 
	{
		ExGlobal s1= new ExGlobal();
		s1.add();
		s1.sub();
		s1.div();
		s1.mod();
		s1.mul();
		

	}

}
