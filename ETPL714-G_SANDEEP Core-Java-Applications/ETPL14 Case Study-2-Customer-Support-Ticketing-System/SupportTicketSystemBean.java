package Package.com.evergent.coreJava.collections.sandeep.customersupportingticketingsystem;

public class SupportTicketSystemBean {

	private int ticketId;
	private String name;
	private String email;
	private String subject;
	private String category;
	private String status;

	public SupportTicketSystemBean(int ticketId, String name, String email, String subject, String category,
			String status) {
		this.ticketId = ticketId;
		this.name = name;
		this.email = email;
		this.subject = subject;
		this.category = category;
		this.status = status;
	}

	public int getTicketId() {
		return ticketId;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getSubject() {
		return subject;
	}

	public String getCategory() {
		return category;
	}

	public String getStatus() {
		return status;
	}

}
