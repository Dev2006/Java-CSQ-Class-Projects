package cloning;

public class TestStudent {
	
	public static void main(String[] args) {
		Student st1 = new Student("Dev", 12, "Java");
		System.out.println(st1);
		
		Student st2 = st1;
		System.out.println(st2);
	}
}
