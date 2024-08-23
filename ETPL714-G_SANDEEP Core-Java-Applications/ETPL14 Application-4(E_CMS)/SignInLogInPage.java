package Package.com.evergent.coreJava.sandeep.application4;

import java.util.Scanner;

class CreateAccount {
	protected static String uname = null;
	protected static String pass = null;
	protected static String conpass = null;

	public CreateAccount(String uname, String pass, String conpass) {
		this.uname = uname;
		this.pass = pass;
		this.conpass = conpass;
	}
}

public class SignInLogInPage extends CreateAccount {
	public SignInLogInPage(String uname, String pass, String conpass) {
		super(uname, pass, conpass);
	}

	public void LoginPage() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("***Weclome To Login Page***");
		System.out.println("Enter Your Username:");
		String Username = sc.nextLine();
		System.out.println("Enter Your Password:");
		String UserPass = sc.nextLine();
		if (uname.equals(Username) && pass.equals(UserPass)) {
			System.out.println("Sccessfully Logged In");
		}
	}

}
