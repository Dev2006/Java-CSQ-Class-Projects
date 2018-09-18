import java.util.Scanner;

public class ScoreClassifier {
	static double score;
	
	public static void main(String[] args) {
		//Declare the reader
		Scanner reader = new Scanner(System.in);
		
		//Print welcome message
		System.out.println("Welcome to Java Marksheet! \n");
		System.out.println("Enter your score below"
				+ "\n" + "And receive your marks");
		
		//Get the score
		score = reader.nextDouble();
		
		//Close the reader
		reader.close();
		
		//Check score value
		if(score >= 90) {
			System.out.println("Your grade is A+"
					+ "\n" + "AMAZING JOB! You worked hard and acheived something incredible");
		} else if(score < 90 && score >= 80) {
			System.out.println("Your grade is A"
					+ "\n" + "Great! Work this hard always because there is always room for improvment");
		} else if(score < 80 && score >= 70) {
			System.out.println("Your grade is A-"
					+ "\n" + "Nice! work harder to get better");
		} else if(score < 70 && score >= 60) {
			System.out.println("Your grade is B"
					+ "\n" + "Awesome try! Next time aim even higher and acheive your goals");
		} else if(score < 60 && score >= 50) {
			System.out.println("Your grade is B-"
					+ "\n" + "Great try. But try and get better, we know you can do it");
		} else if(score < 50 && score >= 40) {
			System.out.println("Your grade is C"
					+ "\n" + "Good try. But you need to put more foocus and effort into your work");
		} else if(score < 40 && score >= 33) {
			System.out.println("Your grade is C-"
					+ "\n" + "We're sure you put in effort, but you need to put a lot more");
		} else {
			System.out.println("Your grade is F"
					+ "\n" + "We're sorry, you failed. But don't give up, there will be many "
							+ "\n" + "more oppurtunities where you can showcase how amazing you really are!");
		}
		
	}

}