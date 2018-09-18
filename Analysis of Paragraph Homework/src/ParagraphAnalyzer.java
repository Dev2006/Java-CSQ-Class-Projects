
public class ParagraphAnalyzer {
	static String para;
	
	//Constructor to initialize paragraph variable
	ParagraphAnalyzer(String para) {
		
		ParagraphAnalyzer.para = para;
	}
		
	//Method for no. of characters
	public static int charsNum() {
		
		return para.length();
	}
	
	//Method for no. of characters
	public static int charsNumWithoutWhitespace() {
		int charsNumWithoutWhitespace = 0;
		
		for(int i = 0; i < para.length(); i++) {
			
			if(!Character.isWhitespace(para.charAt(i))) {
				
				charsNumWithoutWhitespace++;
			}
		}
		
		return charsNumWithoutWhitespace;
	}
	
	//Method for no. of lower case characters
	public static int lowerCaseCharsNum() {
		int lowerCaseCharsNum = 0;
		
		for(int i = 0; i < para.length(); i++) {
			
			if(Character.isLowerCase(para.charAt(i))) {
				
				lowerCaseCharsNum++;
			}
		}
		
		return lowerCaseCharsNum;
	}
		
	//Method for no. of upper case characters
	public static int upperCaseCharsNum() {
		
		int upperCaseCharsNum = 0;
		
		for(int i = 0; i < para.length(); i++) {
			
			if(Character.isUpperCase(para.charAt(i))) {
				
				upperCaseCharsNum++;
			}
		}
		
		return upperCaseCharsNum;
	}
	
	//Method for no. of digits
	public static int digitsNum() {
		int digitsNum = 0;
		
		for(int i = 0; i < para.length(); i++) {
			
			if(Character.isDigit(para.charAt(i))) {
				
				digitsNum++;
			}
		}
		
		return digitsNum;
	}
	
	//Method for no. of chars that are whitespace
	public static int whitespacesNum() {
		int whitespaceCharsNum = 0;
		
		for(int i = 0; i < para.length(); i++) {
			
			if(Character.isWhitespace(para.charAt(i))) {
				
				whitespaceCharsNum++;
			}
		}
		
		return whitespaceCharsNum;
	}
	
	//Method for returning full analysis
	public void printAnalysis() {
		
		System.out.println("No. of characters: " + charsNum());
		System.out.println("No. of characters excluding whitespaces: " + charsNumWithoutWhitespace());
		System.out.println("No. of lower case characters: " + lowerCaseCharsNum());
		System.out.println("No. of upper case characters: " + upperCaseCharsNum());
		System.out.println("No. of digits: " + digitsNum());
		System.out.println("No. of whitespaces: " + whitespacesNum());
	}
}
