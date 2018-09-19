public class User {
	
	private String name;
	private	String password;
	private String email;
	private String mobile;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		
		if(password.length() > 6) {
			this.password = password;
		} else {
			System.out.println("password isn't valid");
			System.out.println("password must have atleast 6 characters");
		}
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		
		if(email.contains("@")) {
			this.email = email;
		} else {
			System.out.println("password isn't valid");
		}
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
