package instanceOf;

public class Y implements X {

	@Override
	public void sayHello() {
		
		System.out.println("Hello!");
	}
	
	public static void main(String[] args) {
		
		Y y = new Y();
		if(y instanceof X)
			y.sayHello();
	}
}
