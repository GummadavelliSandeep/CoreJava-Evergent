package mvcdemo.model;

public class Authenticator {

	public String authenticate(User userBean) {
		if (("ramkumar".equalsIgnoreCase(userBean.getUsername()))
				&& ("ramkumar".equals(userBean.getPassword()))) {
			return "success";
		} else {
			return "failure";
		}
	}
}