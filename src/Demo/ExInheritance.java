package Demo;
interface Exinheritance 
{
      void login_userid();
      void login_password();    
}
class Vee implements Exinheritance
{
     void signup()
	{
		System.out.println("signup with maild id");	
	}
public static void main(String[] args)
{
	
 Vee n1=new Vee();
 n1.login_userid();
 n1.login_password();
n1. signup();
}	 
public void login_userid() 
{

	System.out.println("Sign in with user id");
}
public void login_password() 
{
	
	System.out.println("Sign in with password");
}
}



