import java.util.Scanner;

public class Voweltest {

	public static void main(String[] args) {
		//Creating a reader to read the letters inputed by the user
		Scanner reader = new Scanner(System.in);
		
		System.out.println("WELCOME TO \nTHE LETTER CLASSIFIER! \n");
		System.out.println("This program will ckeck any letter you type in, and classify it as a vowel or a consonant");
		System.out.println("type in a letter bellow to begin");
		
		char letter = reader.next().charAt(0); //stores user inputed letter
		int letterUni = (int)letter; // stores uni-code letter of inputed letter
		
		boolean isLetter = true; //stores boolean letter for if the "letter" is a consonant or vowel
		boolean isVowel = false; //stores boolean letter for if the "letter" is a consonant or vowel
		
		char[] vowels; //Stores an array of vowels that can be used to check 'letter' against
		vowels = new char[] {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'};
		
		//makes "isLetter" true if "letter" is either an upper-case or lower-case letter and false if it isn't
		if ((65 <= letterUni && letterUni <= 90) || (97 <= letterUni && letterUni <= 122)) {
			isLetter = true;
		} else {
			isLetter = false;
		}
		
		//if "isLetter" is true checks for vowels else prints an error message
		if (isLetter) {
			//loops through the "vowels" array and checks if "letter" is one of them
			for(int i = 0; i < vowels.length; i+=2) {
				if(letter == vowels[i]) {
					isVowel = true;
				}
			}
			
			//prints is a vowel if "isVowel" else prints is a consonant
			if(isVowel) {
				System.out.println("Your letter is a vowel");
			} else {
				System.out.println("Your letter is a consonant");
			}
			
		} else {
			System.out.println("Sorry, the inputed symbol isn't a letter");
		}
		
		//Closing reader
		reader.close();
	}
	
}
