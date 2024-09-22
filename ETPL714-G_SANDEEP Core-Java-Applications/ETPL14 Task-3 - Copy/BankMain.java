package Package.com.evergent.coreJava.collections.sandeep.task3;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankInterface bank = new BankImp();
		for (;;) {
			System.out.println("1. Add Registrations 2.Search by CustomerId 3.DisplayAllRegistrations 4. exit");
			int no = sc.nextInt();
			switch (no) {
			case 1:
				System.out.println("Enter the FullName");
				String fullname = sc.next();
				System.out.println("Enter the CustomerId");
				int customerId = sc.nextInt();
				System.out.println("Enter the AccountNumber");
				int accountNumber = sc.nextInt();
				System.out.println("Enter the Mobile Number");
				int mobileNumber = sc.nextInt();
				System.out.println("Enter the emailId");
				String emailId = sc.next();
				BankBean b = new BankBean(fullname, customerId, accountNumber, mobileNumber, emailId);
				bank.addRegistration(b);
				break;
			case 2:
				System.out.println("Enter the CustomerId");
				int custId = sc.nextInt();
				bank.SearchByCustomerId(custId);
				break;

			case 3:
				bank.displayAll();
				break;
			case 4:
				System.exit(0);
			}
		}
	}
}
