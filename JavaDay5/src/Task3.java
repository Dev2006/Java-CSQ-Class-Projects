import java.util.Scanner;

import javax.swing.JOptionPane;

public class Task3 {
	public static void main(String[] args) {
		String[] subject = new String[] {"Math", "ICT", "Science", "Math"};
		String[] name = new String[] {"jack", "will", "dev", "Aakash"};
		int[] rollNum = new int[] {213, 214, 215, 216};
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Press 1 to search by Name"
						+ "\nPress 2 to search by Roll Num."
						+ "\nPress 3 to search by Subject");
		int choice = reader.nextInt();
		
		if(choice == 1) {
			System.out.println("Please Enter Name");
			String findName=reader.next();
			for(int i = 0; i < name.length; i++) {
				if(name[i].equals(findName)) {
					System.out.println(name[i] + ": " + "Roll Num- " + rollNum[i] + ", Subject- " + subject[i]);
				}
			}
		} else if(choice == 2) {
			System.out.println("Please enter the rollno you want to search");
			int findRollNum=reader.nextInt();
			for(int i = 0; i < rollNum.length; i++) {
				if(rollNum[i] == findRollNum) {
					System.out.println(rollNum[i] + ": " + "Name- " + name[i] + ", Subject- " + subject[i]);
				}
			}
		} else if(choice == 3) {
			System.out.println("Enter Subject to search:");
			String findSubject=reader.next();
			for(int i = 0; i < subject.length; i++) {
				if(subject[i].equals(findSubject)) {
					System.out.println(subject[i] + ": " + "Name- " + name[i] + ", Roll Num- " + subject[i]);
				}
			}
		} else {
			System.out.println("The number you have entered id not recognized");
		}
	}
}
