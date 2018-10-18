import java.util.Scanner;

public class OSTest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Select Operating System to See Details>>>>>--------");
	System.out.println("press 1 for Windows");
	System.out.println("press 2 for Mac");
	System.out.println("press 3 for Linux");
	System.out.println("press 4 for DOS");
	int choice=sc.nextInt();
	switch (choice) {
	case 1:System.out.println("Showing Details of Windows OS >>>>>>>>");
		   OS windows=new Windows();
		   windows.ui();
		   windows.type();
		   windows.purpose();
		break;
	case 2:System.out.println("Showing Details of MAC >>>>>>>>>>");
	       OS mac=new Mac();
	       mac.ui();
	       mac.type();
	       mac.purpose();
	       break;
	case 3:System.out.println("Showing Details of Linux >>>>>>>>>>");
	      OS linux=new Linux();
	      linux.ui();
	      linux.type();
	      linux.purpose();
	      break;
	case 4:System.out.println("Showing Details of DOS >>>>>>>>>>");
	      OS dos=new DOS();
	      dos.ui();
	      dos.type();
	      dos.purpose();
	      break;
	default:System.out.println("Invalid Choice......");
		break;
	}
}
}
