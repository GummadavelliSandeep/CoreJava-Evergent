package Package.com.evergent.coreJava.sandeep.application4;

import java.util.Scanner;

abstract public class Catergory {
	static String module = "";
	static int prize;
	static String Product = "";
	static int discountPrize;
	Scanner br = new Scanner(System.in);
	static {
		System.out.println("\t\t\t\t\t Online Shopping");
	}

	Catergory() {
		System.out.println("\t\t\t\tBig Billions Day's Start's from sep 21-oct-8");
	}

	abstract public void WeclcomeCategory(String category);

	public void Mobiles(String C) {
		if (C.equals("MOBILES")) {
			System.out.println("Mobile Name \t Mobile Specifications  \t\t Mobile Prize \t\t Delivery Charge ");
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
			discountPrize = (int) ((prize - prize * 0.1));
		} else {
			System.out.println("Laptop Name \t Laptop Specifications  \t\t Laptop Prize \t\t Delivery Charge ");
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

			discountPrize = (int) ((prize - prize * 0.15));
		}

	}
}
