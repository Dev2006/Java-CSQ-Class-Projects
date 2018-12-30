package instanceOf;

public class TestA {
	
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		if(a instanceof A) {
			
			a.info();
		} else {
			
			System.out.println("a doesn't belong to A");
		}
		
		if(b instanceof A) {
			
			a.info();
		} else {
			
			System.out.println("b doesn't belong to A");
		}
	}
}
