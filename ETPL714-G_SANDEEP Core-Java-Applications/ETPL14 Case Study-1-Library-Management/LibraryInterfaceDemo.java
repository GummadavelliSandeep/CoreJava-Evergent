package Package.com.evergent.coreJava.sandeep.application5;

import java.util.Scanner;

class InvalidUserException extends Exception {
	public InvalidUserException(String message) {
		super(message);
	}
}

class InvalidPasswordLengthException extends Exception {
	public InvalidPasswordLengthException(String message) {
		super(message);
	}
}

class InvalidLoginValidateException extends Exception{
	public InvalidLoginValidateException(String message) {
		super(message);
	}
}

class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}

class InvalidBookException extends Exception {
	public InvalidBookException(String message) {
		super(message);
	}
}

public class LibraryInterfaceDemo {
	static String Username = null;
	static String Userpass = null;
	static int Age = 0;

	public static void CheckUser(String User) throws InvalidUserException {
		boolean UserInput= (User.equals("K") || User.equals("A"));
		if (UserInput== false) {
			throw new InvalidUserException("Invalid User");
		}
	}

	public static void CheckPassword(String Userpass) throws InvalidPasswordLengthException {
		if (Userpass.length() < 6) {
			throw new InvalidPasswordLengthException("Invalid Password,Password length Should be Atleast 6");
		}
	}
	
	public static void LoginValidate(String Validate) throws InvalidLoginValidateException{
		if(!Validate.isEmpty()) {
			throw new InvalidLoginValidateException("Invalid Username or Password,Please Enter the Correct Password");
		}
	}

	public static void CheckAge(int Age,String str) throws InvalidAgeException {
			if (Age >11 && str.equals("K")) {
				throw new InvalidAgeException("Sorry, Age must be less than 12 to Register as a Kid");
			}
			if(Age<12 && str.equals("A")) {
				throw new InvalidAgeException("Sorry, Age must be greater than 12 to Register as a Adult");
			}
	}

	public static void CheckBook(String bookType) throws InvalidBookException {
		switch(bookType) {
		case"Fiction":
			KidUsers ku = new KidUsers("", "");
			String Ks = ku.RequestBook(bookType);
			if (Ks.isEmpty() && bookType.equals("Fiction")) {
			
				throw new InvalidBookException("Oops, You Are Allowed To Take Only  Kids Books");
			}
			break;
		case "Kids":
			AdultUsers Au = new AdultUsers("", "");
			String As = Au.RequestBook(bookType);
			if(As.isEmpty() && bookType.equals("Kids")) {
				throw new InvalidBookException("Oops, You Are Allowed To Take Only Adult Fiction Books");
			}
		}
		
		
		
	}

	public static void main(String[] args) {
		System.out.println("\n\t\t \t\t Welcome To Library Management System");
		System.out.println();

		System.out.println(
				"********************************************************************************************************************");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter Your Option:");
			System.out.println("K-Kid's");
			System.out.println("A-Adult's");
			String User = sc.nextLine();
			CheckUser(User);
			System.out.println("C-Create Account");
			System.out.println("L-Login Page");
			String cl = sc.nextLine();
			switch (cl) {
			case "C":
				System.out.println("********Create A Account********");
				System.out.println("----------------------------------");
				System.out.println("Enter Your Username:");
				Username = sc.nextLine();
				System.out.println("Enter Your Password:");
				Userpass = sc.nextLine();
				CheckPassword(Userpass);
				switch (User) {
				case "K":
					System.out.println("Enter Your Age:");
					Age = sc.nextInt();
					CheckAge(Age,User);
					KidUsers kd = new KidUsers(Username, Userpass);
					kd.RegisterAccount(Username, Userpass);
					String validationK=kd.LoginPage();
					LoginValidate(validationK);
					
					System.out.println("********Choose Your BookType(Kids,Fiction)********:");
					System.out.println("-------------------------------------");
					String bookType = sc.next();
					CheckBook(bookType);
					System.out.println(kd.RequestBook(bookType));
					break;
				case "A":
					System.out.println("Enter Your Age:");
					Age = sc.nextInt();
					CheckAge(Age,User);
					AdultUsers Au = new AdultUsers(Username, Userpass);
					Au.RegisterAccount(Username, Userpass);
					String validationA=Au.LoginPage();
					LoginValidate(validationA);
					System.out.println("********Choose Your BookType(Kids,Fiction)********:");
					System.out.println("-------------------------------------");
					String bookType2 = sc.next();
					CheckBook(bookType2);
					System.out.println(Au.RequestBook(bookType2));
					break;

				}
				break;

			case "L":
				KidUsers kd1 = new KidUsers("SANDEEP", "SANDEEP");
				kd1.LoginPage();
				System.out.println("Choose Your Book:");
				String s = sc.nextLine();
				break;
			}
		} catch (Exception e) {
			System.out.println("Exception Caught:" + e.getMessage());
			System.out.println();

		}
		System.out.println("----------------------------------------------------------------");

	}
}
