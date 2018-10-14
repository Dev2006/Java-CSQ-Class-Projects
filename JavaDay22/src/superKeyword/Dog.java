package superKeyword;

public class Dog extends Animal {
	
	public Dog() {
		
		super();
		System.out.println("Dog class constructor called");
	} 
	
	public static void main(String[] args) {
		
		Dog d = new Dog();
	}
}
