public class MainClass {
	static int data = 45;
	
	static class Inner {
		
		void msg() {
			
			System.out.println("Data = " + data);
		}
	}
	
	public static void main(String[] args) {
		MainClass.Inner minn = new MainClass.Inner();
		minn.msg();
	}
}
