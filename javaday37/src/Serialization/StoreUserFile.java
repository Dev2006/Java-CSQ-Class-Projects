package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StoreUserFile {
public static void main(String[] args) {
	try {
		User user=new User(21,"aakash");
		FileOutputStream fout=new FileOutputStream("C:\\Users\\Mohit Sharma\\Desktop\\save.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(user);
		System.out.println("data written success");
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
