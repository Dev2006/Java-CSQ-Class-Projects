public class TestStudent {
	public static void main(String[] args) {
		Student st = new Student();
		
		st.setRollno(100);
		st.setName("Dev");
		st.setFee(3999);
		
		System.out.println("Name: " + st.getName());
		System.out.println("Rollno: " + st.getRollno());
		System.out.println("Fee: " + st.getFee());
	}
}