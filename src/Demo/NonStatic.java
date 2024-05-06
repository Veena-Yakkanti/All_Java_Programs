package Demo;

public class NonStatic
{
		void add()
		{
			int a=39;
			int b=42;
			System.out.println(a+b);				
		}
        void sub()
        {   
        	int c=34;
        	int d=90;
        	System.out.println(d-c);
        }
        void mul()
        {
        	int e=3;
        	int f=12;
        	System.out.println(e*f);
        }
        void div()
        {
        	int g=10;
        	int h=2;
        	System.out.println(g/h);
        }
        void mod()
        {
        	int b1=90;
        	int b2=12;
        	System.out.println(b1%b2);     	
        }
        public static void main(String[] args)
        {
		NonStatic a1=new NonStatic();
		a1.add();
        a1.sub();
        a1.mul();
        a1.div();
        a1.mod();
       
        }
        
	}

