package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestEmployee {
	
	public static void main(String[] args) {
		Employee emp = new Employee(112, "Dev", 5000);
		
		try {
			//Serialization
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Mohit Sharma\\Desktop\\save.txt"));
			out.writeObject(emp);
			System.out.println("Original Object : \n" + emp);
			
			//Deserialization
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\Mohit Sharma\\Desktop\\save.txt"));
			Employee emp2 = (Employee) in.readObject();
			System.out.println("Deserialized object : \n" + emp2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
