package superKeyword;

public class B extends A {
	
	private void callSuper() {
		
		super.num = 40;
	}
	
	public static void main(String[] args) {
		
		B b = new B();
		
		b.num = 50;
		System.out.println("using instance to change instance var	========================	" + b.num);
		
		b.callSuper();
		System.out.println("using super to change instance var   	========================	" + b.num);
	}
}