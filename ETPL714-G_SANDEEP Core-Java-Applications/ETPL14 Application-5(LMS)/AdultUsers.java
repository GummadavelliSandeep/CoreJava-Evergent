package Package.com.evergent.coreJava.sandeep.application5;

import java.util.Scanner;

public class AdultUsers implements LibraryUser {

	String uname;
	String password;

	public AdultUsers(String uname, String password) {
		this.uname = uname;
		this.password = password;
	}

	public void RegisterAccount(String uname, String password) {
		if (uname.equals(uname) && password.equals(password)) {
			System.out.println("You have successfully registered under a Adult Account");
			System.out.println("-------------------------------------------------------");
			System.out.println();
		}

	}

	public String LoginPage() {
		Scanner sc = new Scanner(System.in);
		System.out.println("********Weclome To Login Page********");
		System.out.println("---------------------------------------");
		System.out.println("Enter Your Username:");
		String Username = sc.nextLine();
		System.out.println("Enter Your Password:");
		String Userpass = sc.nextLine();
		if (uname.equals(Username) && password.equals(Userpass)) {
			System.out.println("You have Successfully logged In");
			System.out.println("---------------------------------");
			System.out.println();
			return "";
		} 
		return "Invalid Credintial's";
	}

	@Override
	public String RequestBook(String bookType) {
		if (bookType.equals("Fiction")) {
			return "Book Issued Successfully, Please Return The Book Within 7 Days";
		}
		return "";

	}

}
