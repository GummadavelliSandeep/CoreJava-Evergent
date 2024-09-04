package Package.com.evergent.coreJava.collections.sandeep.customersupportingticketingsystem;

public interface SupportTicketSystemInterface {
	public void addTicket(SupportTicketSystemBean sb );
	public void searchByTicketId(int ticketId);
	public void processNextTicket();
	public void peekNextTicket();
	public void displayQueue();
}
