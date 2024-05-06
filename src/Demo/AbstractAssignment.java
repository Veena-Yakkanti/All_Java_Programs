package Demo;
class amazon
{
	void signup()
	{
		System.out.println("Sign up with email");
	}
	void login()
	{
		System.out.println("Sign in with email");
	}
abstract class amazon_login extends amazon
{
	abstract void login_userid();
	abstract void login_password();
	void product()
	{
		System.out.println("search for product");
	}
	void add()
	{
		System.out.println("add product to cart");
	}
}	
}
public class AbstractAssignment extends amazon
{
        void addmore()
        {
        	System.out.println("add more product to cart");       	
        }
        void buy()
        {
        	System.out.println("buy product");       	
        }
	public static void main(String[] args)
	{
	  AbstractAssignment n1= new AbstractAssignment();
	  n1.signup();
	  n1.login();
	  n1.login_userid();
	  n1.login_password();
	  n1.product();
	  n1.add();
	  n1.addmore();
	  n1.buy();	  
	}
	private void login_userid() 
	{
	   System.out.println("Login with user id");
	}
	private void add() 
	{
		System.out.println("add required product to cart");
	}
	private void product() 
	{
		System.out.println("Search procuts");
	}
	private void login_password() 
	{
		System.out.println("Login with password");
	}
}
