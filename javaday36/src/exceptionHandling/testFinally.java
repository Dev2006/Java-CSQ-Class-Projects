package exceptionHandling;

public class testFinally {
public static void main(String[] args) {
	try {
		int a=25/0;
		System.out.println(a);
	} catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println("it will always executed");
}
}
