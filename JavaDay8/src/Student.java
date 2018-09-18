
public class Student {
	int rollnum;
	String name;
	String stream;
	
	public Student() {
		rollnum = 3645;
		name = "Dev";
		stream = "Astrophysics";
	}
	
	public Student(int rn, String n, String s) {
		rollnum = rn;
		name = n;
		stream = s;
	}
	
	void printData() {
		System.out.println("roll num. : " + rollnum + "\n" + "name : " + name + "\n" + "stream : " + stream);
	}
}
