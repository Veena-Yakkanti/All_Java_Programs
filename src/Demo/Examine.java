package Demo;
interface Examine  
	{
	      void login_userid();
	      void login_password();    
	}
interface Exist extends Examine
{
	void add();
}
class Jasmine implements Examine, Exist
	{
	     void signup()
		{
			System.out.println("signup with maild id");	
		}
	
	public static void main(String[] args)
	{
		
	 Jasmine n1=new Jasmine();
	 n1.login_userid();
	 n1.login_password();
	n1. signup();
	n1.add();
	}	 
	public void login_userid() 
	{

		System.out.println("Sign in with user id");
	}
	public void login_password() 
	{
		
		System.out.println("Sign in with password");
	}

	public void add() {
		System.out.println("addition");
		
	}
	}
	
