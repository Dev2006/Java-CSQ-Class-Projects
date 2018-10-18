public class B implements A{
@Override
public void sayHello() {
	System.out.println("Hello Interface");
	
}
public static void main(String[] args) {
	B b=new B();

	b.sayHello();
}
}
