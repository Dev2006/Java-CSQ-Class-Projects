public class TestUser {
	
	public static void main(String[] args) {
		
		User a = new User();
		
		a.setName("Dev");
		a.setPassword("ds123");
		a.setMobile("9754685624");
		a.setEmail("devsharma@gmail.com");
		
		System.out.println("Name: " + a.getName());
		System.out.println("Password: " + a.getPassword());
		System.out.println("Mobile: " + a.getMobile());
		System.out.println("E-Mail: " + a.getEmail());
	}
}
