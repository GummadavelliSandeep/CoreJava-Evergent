package Package.com.evergent.coreJava.sandeep.application4;

import java.util.Scanner;

public class ECommerceMainInformation extends Catergory implements ECommerceSiteInterface, ReportModuleInterface {
	public void Amzon() {
		System.out.println("\n\t\t \t\t Welcome To Amzon Shopping");
		System.out.println(
				"********************************************************************************************************************");
		System.out.println("Choose A Category (MOBILES,LAPTOPS) : ");
	}

	public void Flipkart() {
		System.out.println("\n\t\t \t\t\t Welcome To Flipkart Shopping");
		System.out.println(
				"********************************************************************************************************************");
		System.out.println("\t\t\t\t*****Choose A Category To Order Products*****");
		System.out.println("");
		System.out.println("Choose A Category (MOBILES,LAPTOPS) : ");
	}

	public void WeclcomeCategory(String category) {
		if (category.equals("LAPTOPS")) {
			System.out.println("\t\t\t\t***Welcome to Laptops Category***");
			System.out.println();
		} else {
			System.out.println("\t\t\t\t***Welcome to Mobiles Category***");
			System.out.println();
		}

	}

	public void TotalAmountToBePaid() {
		System.out.println("Total Amount to be Paid After Discount:" + (discountPrize) + "Rs");
	}

	public void MakePayment() {
		System.out.println("To Make Payment :" + (prize) + "Rs");
		System.out.println();
		System.out.println("Select Mode Of Payment:");
		System.out.println("=========================================================================");
		System.out.println("Enter your Payment Mode code (CREDITCARD,DEBITCARD): ");

	}

	public void Invoice() {
		System.out.println("Invoice Display");
		System.out.println("==================================");
		System.out.println("Ordered Id:" + (Math.ceil(Math.random())));
		System.out.println("Purchased Product:" + Product);
		System.out.println("Amount Paid:" + (discountPrize) + "Rs");

	}

	public void SummaryOfOrdersAndPaymentMade() {
		System.out.println("Summary Of Order");
		System.out.println("=======================================================================");
		System.out.println("Selected Product:" + Product);
		System.out.println("Selected Product item cost:" + prize + "Rs");
		System.out.println("Amount To be Paid for Selected Product after Discount:" + discountPrize + "Rs");
		System.out.println("Total Amount to be Paid:" + (discountPrize) + "Rs");
	}

	public static void Transaction(int amount, int discount) {
		System.out.println("Total Amount To Be Paid Before Discount:" + prize + "Rs");
		System.out.println("Total Amount To Be Paid After Discount:" + discountPrize + "Rs");
		System.out.println();

	}

	public static final void TransactionSccessful() {
		System.out.println("\t Payment Scessfull,Thank You");

	}

	public static void main(String[] args) {
		System.out.println("\n\t\t \t\t Welcome To E-COMMERECE MANAGEMENT SYSTEM");
		ECommerceMainInformation em = new ECommerceMainInformation();
		System.out.println(
				"********************************************************************************************************************");
		Scanner br = new Scanner(System.in);
		System.out.println();
		System.out.println("C-Create Account");
		System.out.println("L-Login Page");
		String CL = br.nextLine();
		switch (CL) {
		case "C":
			System.out.println("***Create A New Account***");
			System.out.println("Enter Your UserName:");
			String uname = br.nextLine();
			System.out.println("Enter Your Password:");
			String pass = br.nextLine();
			System.out.println("Enter Your Confirm Password:");
			String conpass = br.nextLine();
			SignInLogInPage sl = new SignInLogInPage(uname, pass, conpass);
			sl.LoginPage();
			break;
		case "L":
			SignInLogInPage sll = new SignInLogInPage("", "", "");
			sll.LoginPage();

		}

		String module = null;
		while (true) {
			System.out.println();
			System.out.println("E-COMMERCE Main Menu");
			System.out.println("=====================================");
			System.out.println("S-Select E-Commerce Site");
			System.out.println("P-Payment Module");
			System.out.println("R-Report Module");
			System.out.println("E-Quit Module");
			System.out.println("=====================================");
			System.out.println("Enter your Module code (S,P,R,E) : ");
			module = br.nextLine();
			System.out.println("You entered module is  : ");

			switch (module1.valueOf(module)) {

			case S:

				System.out.println(" Select E-Commerce Site");
				System.out.println("=====================================");
				System.out.println("A-to place orders in Amzon");
				System.out.println("F-to place Orders in Flipkart");
				System.out.println("M-Return to Main Menu");
				System.out.println("=====================================");
				System.out.println("Enter your Module code (A,F,M) : ");
				module = br.nextLine();
				switch (submodule1.valueOf(module)) {
				case A:
					em.Amzon();
					module = br.nextLine();
					System.out.println();
					em.WeclcomeCategory(module);
					em.Mobiles(module);
					break;
				case F:
					em.Flipkart();
					module = br.nextLine();
					System.out.println();
					em.WeclcomeCategory(module);
					em.Mobiles(module);
					break;
				}

				break;
			case P:
				System.out.println(" Payment Module");
				System.out.println("=====================================");
				System.out.println("T-to display total amount to be paid");
				System.out.println("P-to make payment");
				System.out.println("M-Return to Main Menu");
				System.out.println("=====================================");
				System.out.println("Enter your Module code (T,P,M) : ");
				module = br.nextLine();
				switch (submodule2.valueOf(module)) {
				case T:
					em.TotalAmountToBePaid();
					break;
				case P:
					em.MakePayment();
					module = br.nextLine();
					switch (Payment.valueOf(module)) {
					case CREDITCARD:
						System.out.println("20% Discount With These Credit Cards(HDFC,ICIC,SBI)");
						Transaction(prize, 20);
						ECommerceMainInformation.TransactionSccessful();
						break;
					case DEBITCARD:
						System.out.println("10% Discount With These Debit Cards(Kotak,UnionBank,SBI)");
						Transaction(prize, 10);
						ECommerceMainInformation.TransactionSccessful();
						break;
					}
					break;
				default:
					break;
				}
				break;

			case R:
				System.out.println(" Payment Module");
				System.out.println("=====================================================");
				System.out.println("I-to dispaly invoice for order mode");
				System.out.println("S-to display the summary of orders and payments made");
				System.out.println("M-Return to Main Menu");
				System.out.println("======================================================");
				System.out.println("Enter your Module code (I,S,M) : ");
				module = br.nextLine();

				switch (submodule3.valueOf(module)) {
				case I:
					em.Invoice();
					break;
				case S:
					em.SummaryOfOrdersAndPaymentMade();
					break;
				default:
					break;
				}
				break;

			case E:
				System.out.println("Quit Module");
				System.exit(0);
				break;
			}

		}

	}

}
