package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StoreBoth {
public static void main(String[] args) {
	try {
		Manager mgr=new Manager(112,"aakash",122222);
		
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("C:\\Users\\Mohit Sharma\\Desktop\\save2.txt"));
		out.writeObject(mgr);
		System.out.println("sucess");
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\Mohit Sharma\\Desktop\\save2.txt"));
		Manager mgr2=(Manager)ois.readObject();
		mgr2.display();
		
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
