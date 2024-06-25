package SeleniumBasic;
interface Exam2
{
	 abstract void login();
	void logout();
}
interface exam3 extends Exam2
{
	void signin();
	void signup();
}
abstract class Exam4
{
	abstract void signup();
}
abstract class Exam5 extends Exam4
{
	abstract void loginwithemail();
}
public class Viva extends Exam5
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Viva v1=new Viva();
		v1.loginwithemail();
		v1.signup();
	}

	@Override
	void loginwithemail() {
		// TODO Auto-generated method stub
		System.out.println("loginwithemail");
	}

	@Override
	void signup() {
		// TODO Auto-generated method stub
		System.out.println("signup");
		
	}


}
