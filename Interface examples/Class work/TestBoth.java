
public class TestBoth implements hello,hello2{

	@Override
	public void sayHello() {
		System.out.println("This is Hello ");
		
	}
	public static void main(String[] args) {
		TestBoth b=new TestBoth();
		b.sayHello();
		b.iamNormal();
	}

}
