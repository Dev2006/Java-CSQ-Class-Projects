package Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FetchUserFile {
public static void main(String[] args) {
	try {
	ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\Mohit Sharma\\Desktop\\save.txt"));
	User u=(User) ois.readObject();
	System.out.println(u);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
