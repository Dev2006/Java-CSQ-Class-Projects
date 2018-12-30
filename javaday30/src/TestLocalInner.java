
public class TestLocalInner {
	private int data = 45;
	
	public void display() {
		
		class Local {
			
			void msg() {
				
				System.out.println("Data = " + data);
			}
		}
		
		Local l = new Local();
		l.msg();
	}
	
	public static void main(String[] args) {
		TestLocalInner tli = new TestLocalInner();
		
		tli.display();
	}
}
