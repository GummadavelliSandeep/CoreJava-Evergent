package Package.com.evergent.coreJava.collections.sandeep.task3;

import java.util.*;

public class BankImp implements BankInterface {
	HashSet<BankBean> RegistrationList = new HashSet<>();

	@Override
	public void addRegistration(BankBean b) {
		RegistrationList.add(b);

	}

	@Override
	public void SearchByCustomerId(int customerId) {
		boolean b = false;
		if (RegistrationList.size() > 0 && RegistrationList != null) {
			for (BankBean Registraions : RegistrationList) {
				if (RegistrationList.size() > 0 && RegistrationList != null) {
					System.out.println(Registraions.getFullName() + " " + Registraions.getCustomerId() + " "
							+ Registraions.getMobileNumber() + " " + Registraions.getEmailId());
				}
			}
			b = true;

		}
		if (!b) {
			System.out.println("No Record's Found with this CustomerId");
		}

	}

	@Override
	public void displayAll() {
		if (RegistrationList.size() > 0) {
			for (BankBean Registraions : RegistrationList) {
				System.out.println(Registraions.getFullName() + " " + Registraions.getCustomerId() + " "
						+ Registraions.getMobileNumber() + " " + Registraions.getEmailId());
			}
		}
		else {
			System.out.println("No Records are Found");
		}

	}

}
