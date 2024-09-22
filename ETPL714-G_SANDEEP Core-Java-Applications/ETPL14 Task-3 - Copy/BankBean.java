package Package.com.evergent.coreJava.collections.sandeep.task3;

public class BankBean {
	

	private String fullName;
	private int customerId;
	private int accountNumber;
	private int mobileNumber;
	private String emailId;

	public BankBean(String fullName, int customerId, int accountNumber, int mobileNumber, String emailId) {
		this.fullName = fullName;
		this.customerId = customerId;
		this.accountNumber = accountNumber;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
	}
	public String getFullName() {
		return fullName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

}
