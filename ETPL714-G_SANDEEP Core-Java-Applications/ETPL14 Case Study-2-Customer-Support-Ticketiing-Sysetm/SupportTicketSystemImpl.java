package Package.com.evergent.coreJava.collections.sandeep.customersupportingticketingsystem;

import java.util.ArrayDeque;

public class SupportTicketSystemImpl implements SupportTicketSystemInterface {
	ArrayDeque<SupportTicketSystemBean> ticketQueue = new ArrayDeque<SupportTicketSystemBean>();

	@Override
	public void addTicket(SupportTicketSystemBean ticketBean) {
		ticketQueue.add(ticketBean);
	}

	@Override
	public void searchByTicketId(int ticketId) {
		if (ticketQueue.size() > 0 && ticketQueue != null) {
			for (SupportTicketSystemBean ticketD : ticketQueue) {
				if (ticketId == ticketD.getTicketId()) {
					System.out.println("Ticket Deatils Are: " + ticketD.getTicketId() + " " + ticketD.getName() + " "
							+ ticketD.getEmail() + " " + ticketD.getCategory() + " " + ticketD.getStatus());
				} else {
					System.out.println("Sorry,Ticket Not Found");
					break;
				}

			}
		}

	}

	@Override
	public void processNextTicket() {
		if (ticketQueue.size() > 0 && ticketQueue != null) {
			SupportTicketSystemBean processNxtTicket = ticketQueue.poll();
			System.out.println("Ticket Proccessed Sucessfully: " + processNxtTicket.getTicketId() + " "
					+ processNxtTicket.getName() + " " + processNxtTicket.getEmail() + " "
					+ processNxtTicket.getCategory() + " " + processNxtTicket.getStatus());
		} else {
			System.out.println("TicketQueue is Empty");
		}

	}

	@Override
	public void peekNextTicket() {
		if (ticketQueue.size() > 0 && ticketQueue != null) {
			SupportTicketSystemBean peekNxtTicket = ticketQueue.peek();
			System.out.println("Ticket to be Processed is: " + peekNxtTicket.getTicketId() + " "
					+ peekNxtTicket.getName() + " " + peekNxtTicket.getEmail() + " " + peekNxtTicket.getCategory() + " "
					+ peekNxtTicket.getStatus());
			;
		} else {
			System.out.println("TicketQueue is Empty");
		}

	}

	@Override
	public void displayQueue() {
		if (ticketQueue.size() > 0) {
			for (SupportTicketSystemBean SupSysTicDisp : ticketQueue) {
				System.out.println(
						SupSysTicDisp.getTicketId() + " " + SupSysTicDisp.getName() + " " + SupSysTicDisp.getEmail()
								+ " " + SupSysTicDisp.getCategory() + " " + SupSysTicDisp.getStatus());
			}
		}
	}

}
