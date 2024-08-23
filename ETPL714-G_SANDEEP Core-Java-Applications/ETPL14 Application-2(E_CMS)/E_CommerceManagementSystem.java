package Package.com.evergent.coreJava.sandeep.application2;

import java.io.IOException;
import java.util.Scanner;

public class E_CommerceManagementSystem {

	enum module1 {
		S, P, R, E
	};

	enum submodule1 {
		A, F
	};

	enum submodule2 {
		T, P, M
	};

	enum submodule3 {
		I, S, M
	};

	enum Products {
		MOBILES, LAPTOPS
	}

	enum Mobiles {
		REALME, SAMSUNG, REDMI
	};

	enum Laptops {
		DELL, HP, LENAVO
	}

	enum Payemnt {
		UPI, CREDITCARD, DEBITCARD, CASHONDELIVERY
	}

	static int prize;
	static int discountPrize;
	static String Product = null;

	public static void main(String[] args) throws IOException {
		String module = null;

		Scanner br = new Scanner(System.in);

		System.out.println("\n\t\t \t\t Welcome To E-COMMERECE MANAGEMENT SYSTEM");

		while (true) {

			System.out.println(
					"********************************************************************************************************************");
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

					System.out.println("\n\t\t \t\t Welcome To Amzon Shopping");
					System.out.println(
							"********************************************************************************************************************");
					System.out.println("Choose A Category (MOBILES,LAPTOPS) : ");

					module = br.nextLine();
					System.out.println();
					switch (Products.valueOf(module)) {
					case MOBILES:
						System.out.println(
								"Mobile Name \t Mobile Specifications  \t\t Mobile Prize \t\t Delivery Charge ");
						System.out.println(
								"=======================================================================================================================");
						System.out.println(
								"Realme-13 \t8GB-RAM|128GB-ROM \n \t \t Processor Snapdragon 7s Gen2 \n \t\t Font Camera-32 MP \n\t \t Display-6.7 inch Full HD\n\t \t Battery-5200 mAh  \t\t\t 32,999.00/-Rs \t\t Free");
						System.out.println("");
						System.out.println(
								"-----------------------------------------------------------------------------------------------------------------------");
						System.out.println(
								"SamGalaxyS23 \t8GB-RAM|128GB-ROM \n \t \t Processor Samsung Exynos 2200 \n \t\t Font Camera-10 MP \n\t \t Display-6.4 inch Full HD\n\t \t Battery-4500 mAh  \t\t\t 33,999.00/-Rs \t\t Free");
						System.out.println("");
						System.out.println(
								"-----------------------------------------------------------------------------------------------------------------------");
						System.out.println(
								"RedmiNote13 \t8GB-RAM|128GB-ROM \n \t \t Processor-7s Gen2 Mobile Platform 5G\n\t \t Font Camera-16MP \n\t \t Display-6.67 inch Full HD\n\t \t Battery-5100 mAh  \t\t\t 21,414.00/-Rs \t\t 40.00/-Rs");
						System.out.println("");
						System.out.println(
								"-----------------------------------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Choose A Phone (REALME,SAMSUNG,REDMI) : ");

						module = br.nextLine();

						switch (Mobiles.valueOf(module)) {
						case REALME:
							prize = 32990;
							Product = "REALME";
							break;
						case SAMSUNG:
							prize = 33990;
							Product = "SAMSUNG";
							break;
						case REDMI:
							prize = 21414;
							Product = "REDMI";
							break;
						}
						break;
					case LAPTOPS:
						System.out.println(
								"Laptop Name \t Laptop Specifications  \t\t Laptop Prize \t\t Delivery Charge ");
						System.out.println(
								"========================================================================================================================");
						System.out.println(
								"\n Dell \t\t Processor-Intel Core i5 13th Gen \n \t\t RAM-8GB \n\t\t SSD Storage-256GB \n\t\t Screen Size-14inch \n\t\t Weight-1.58kg  \t\t\t 57,990.00/-Rs \t\t Free");
						System.out.println("");
						System.out.println(
								"-----------------------------------------------------------------------------------------------------------------------");
						System.out.println(
								"\n Hp \t\t Processor-Intel Core i5 12th Gen \n \t\t RAM-16GB \n\t\t SSD Storage-512GB \n\t\t Screen Size-15.6 inch \n\t\t Weight-1.69kg  \t\t\t 68,990.00/-Rs \t\t Free");
						System.out.println("");
						System.out.println(
								"-----------------------------------------------------------------------------------------------------------------------");
						System.out.println(
								"\n Lenavo \t Processor-Intel Core i5 13th Gen \n \t\t RAM-16GB \n\t\t SSD Storage-512GB \n\t\t Screen Size-15.6 inch \n\t\t Weight-1.7  \t\t\t\t 49,990.00/-Rs \t\t 40.00/-Rs");
						System.out.println(
								"-----------------------------------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Choose A Laptop (DELL,HP,LENAVO) : ");

						module = br.nextLine();

						switch (Laptops.valueOf(module)) {
						case DELL:
							prize = 57990;
							Product = "DELL";
							break;
						case HP:
							prize = 68990;
							Product = "HP";
							break;
						case LENAVO:
							prize = 49990;
							Product = "LENAVO";
							break;
						}
						break;
					}

					discountPrize = (int) ((prize - prize * 0.15));

					break;
				case F:
					System.out.println("\n\t\t \t\t\t Welcome To Flipkart Shopping");
					System.out.println(
							"********************************************************************************************************************");
					System.out.println("\t\t\t\t*****Choose A Category To Order Products*****");
					System.out.println("");
					System.out.println("Choose A Category (MOBILES,LAPTOPS) : ");

					module = br.nextLine();
					switch (Products.valueOf(module)) {
					case MOBILES:
						System.out.println(
								"Mobile Name \t Mobile Specifications  \t\t Mobile Prize \t\t Delivery Charge ");
						System.out.println(
								"=======================================================================================================================");
						System.out.println(
								"Realme-13pro+ \tRAM-8GB|128GB-ROM \n \t \t Processor Snapdragon 7s Gen2 \n \t\t Font Camera-32 MP \n\t \t Display-6.7 inch Full HD\n\t \t Battery-5200 mAh  \t\t\t 32,999.00/-Rs \t\t Free");
						System.out.println("");
						System.out.println(
								"-----------------------------------------------------------------------------------------------------------------------");
						System.out.println(
								"SamsungGalaxyS23 FE \t8GB-RAM|128GB-ROM \n \t \t Processor Samsung Exynos 2200 \n \t\t Font Camera-10 MP \n\t \t Display-6.4 inch Full HD\n\t \t Battery-4500 mAh  \t\t\t 33,999.00/-Rs \t\t Free");
						System.out.println("");
						System.out.println(
								"-----------------------------------------------------------------------------------------------------------------------");
						System.out.println(
								"RedmiNote13pro 5G \t8GB-RAM|128GB-ROM \n \t \t Processor-7s Gen2 Mobile Platform 5G\n\t \t Font Camera-16MP \n\t \t Display-6.67 inch Full HD\n\t \t Battery-5100 mAh  \t\t\t 21,414.00/-Rs \t\t 40.00/-Rs");
						System.out.println("");
						System.out.println(
								"-----------------------------------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Choose A Mobile (REALME,SAMSUNG,REDMI) : ");

						module = br.nextLine();

						switch (Mobiles.valueOf(module)) {
						case REALME:
							prize = 32990;
							Product = "REALME";
							break;
						case SAMSUNG:
							prize = 33990;
							Product = "SAMSUNG";
							break;
						case REDMI:
							prize = 21414;
							Product = "REDMI";
							break;
						}
						prize = (int) ((prize - prize * 0.15));

						break;
					case LAPTOPS:
						System.out.println("Laptop Name \t Laptop Specifications  \t Laptop Prize \t Delivery Charge ");
						System.out.println(
								"========================================================================================================================");
						System.out.println(
								"\n Dell \t\t Processor-Intel Core i5 13th Gen \n \t\t RAM-8GB \n\t\t SSD Storage-256GB \n\t\t Screen Size-14inch \n\t\t Weight-1.58kg  \t\t\t 57,990.00/-Rs \t 40.00/-Rs");
						System.out.println("");
						System.out.println(
								"-----------------------------------------------------------------------------------------------------------------------");
						System.out.println(
								"\n Hp \t\t Processor-Intel Core i5 12th Gen \n \t\t RAM-16GB \n\t\t SSD Storage-512GB \n\t\t Screen Size-15.6 inch \n\t\t Weight-1.69kg  \t\t\t 68,990.00/-Rs \t 40.00/-Rs");
						System.out.println("");
						System.out.println(
								"-----------------------------------------------------------------------------------------------------------------------");
						System.out.println(
								"\n Lenavo \t\t Processor-Intel Core i5 13th Gen \n \t\t RAM-16GB \n\t\t SSD Storage-512GB \n\t\t Screen Size-15.6 inch \n\t\t Weight-1.7  \t\t\t 49,990.00/-Rs \t 40.00/-Rs");
						System.out.println(
								"-----------------------------------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Choose A Laptop (DELL,HP,LENAVO) : ");

						module = br.nextLine();

						switch (Laptops.valueOf(module)) {
						case DELL:
							prize = 57990;
							Product = "DELL";
							break;
						case HP:
							prize = 68990;
							Product = "HP";
							break;
						case LENAVO:
							prize = 49990;
							Product = "LENAVO";
							break;
						}
						break;
					}

					discountPrize = (int) ((prize - prize * 0.15));

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
					System.out.println("Total Amount to Bsse Paid :" + (prize + "Rs"));
					System.out.println("Total Amount to be Paid After Discount:" + (discountPrize) + "Rs");

					break;
				case P:
					System.out.println("To Make Payment :" + (prize) + "Rs");
					System.out.println();
					System.out.println("Select Mode Of Payment:");
					System.out.println("=========================================================================");
					System.out.println("Enter your Payment Mode code (UPI,CREDITCARD,DEBITCARD,CASHONDELIVERY): ");
					module = br.nextLine();
					switch (Payemnt.valueOf(module)) {
					case UPI:
						System.out.println("Ordered Placed Successfully");
						System.out.println("Transaction is Successful");
						break;
					case CREDITCARD:
						System.out.println("Ordered Placed Sucessfully");
						System.out.println("Transaction is Successful");
						break;
					case DEBITCARD:
						System.out.println("Ordered Placed Sucessfully");
						System.out.println("Transaction is Successful");
						break;
					case CASHONDELIVERY:
						System.out.println("Ordered Placed Sucessfully");
						System.out.println("Transaction is Successfull");
						break;
					}

					break;
				}
				break;

			case R:

				System.out.println(" Report Module");
				System.out.println("=====================================================");
				System.out.println("I-to dispaly invoice for order mode");
				System.out.println("S-to display the summary of orders and payments made");
				System.out.println("M-Return to Main Menu");
				System.out.println("======================================================");
				System.out.println("Enter your Module code (I,S,M) : ");

				module = br.nextLine();
				switch (submodule3.valueOf(module)) {

				case I:
					System.out.println("Invoice Display");
					System.out.println("==================================");
					System.out.println("Ordered Id:" + (Math.ceil(Math.random())));
					System.out.println("Purchased Product:" + Product);
					System.out.println("Amount Paid:" + (discountPrize) + "Rs");

					break;
				case S:
					System.out.println("Summary Of Order");
					System.out.println("=======================================================================");
					System.out.println("Selected Product:" + Product);
					System.out.println("Selected Product item cost:" + prize + "Rs");
					System.out.println("Amount To be Paid for Selected Product after Discount:" + discountPrize + "Rs");
					System.out.println("\n");
					System.out.println("Total Amount to be Paid:" + (discountPrize) + "Rs");

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
