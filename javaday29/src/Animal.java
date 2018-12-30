
public abstract class Animal {
	
	public abstract void eat();
	
	public static void main(String[] args) {
		Animal an = new Animal() {
			
			@Override
			public void eat() {
				
				System.out.println("Animal is eating");
			}
		};
		
		an.eat();
	}
}
