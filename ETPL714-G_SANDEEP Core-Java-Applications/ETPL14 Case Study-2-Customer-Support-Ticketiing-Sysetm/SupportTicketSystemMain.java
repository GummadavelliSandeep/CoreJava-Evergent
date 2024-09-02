package Package.com.evergent.coreJava.collections.sandeep.customersupportingticketingsystem;

import java.util.Scanner;

public class SupportTicketSystemMain {
	public static void main(String[] args) {
		System.out.println("\n\t\t\t\t\t\t\t Welcome To Customer Supporting Ticketing System ");
		System.out.println("********************************************************************************************************************************************************");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		SupportTicketSystemImpl ticket = new SupportTicketSystemImpl();
		for (;;) {
			System.out.println(
					"1. addTicket 2.searchByTicketId 3.processNextTicket 4.peekNextTicket 5.displayQueue 6. exit");
			int no = sc.nextInt();
			switch (no) {
			case 1:
				System.out.println("Enter the TicketId");
				int ticketId = sc.nextInt();
				System.out.println("Enter the FullName");
				String fullname = sc.next();
				System.out.println("Enter the Email");
				String email = sc.next();
				System.out.println("Enter the Subject");
				String subject = sc.next();
				System.out.println("Enter the Category");
				String category = sc.next();
				System.out.println("Enter the Status");
				String status = sc.next();
				SupportTicketSystemBean s = new SupportTicketSystemBean(ticketId, fullname, email, subject, category,
						status);
				ticket.addTicket(s);
				System.out.println("---------------------------------------------------------------------------------------------");
				break;
			case 2:
				System.out.println("Enter TicketId:");
				int ticketid=sc.nextInt();
				ticket.searchByTicketId(ticketid);
				System.out.println("-----------------------------------------------------------------------------------------------");
				break;
			case 3:
				ticket.processNextTicket();
				System.out.println("-----------------------------------------------------------------------------------------------");
				break;

			case 4:
				ticket.peekNextTicket();
				System.out.println("-----------------------------------------------------------------------------------------------");
				break;
			case 5:
				ticket.displayQueue();
				System.out.println("-----------------------------------------------------------------------------------------------");
				break;
			case 6:
				System.exit(0);
			}
		}
	}
}
