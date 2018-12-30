package randomClass;

import java.util.Random;

public class OTPGenerator {
	
	public static void main(String[] args) {
		System.out.println("Your OTP is " + randomOTP());
	}
	
	public static String randomNumberOTP() {
		String OTP = new String("");
		Random r = new Random();
		
		for(int i = 0; i < 6; i++)
			OTP += r.nextInt(10);
		
		return OTP;
	}
	
	public static String randomOTP() {
		String OTP = new String("");
		Random r = new Random();

		for(int i = 0; i < 3; i++)
			OTP += new Character((char) (r.nextInt(26) + 65));
		
		for(int i = 0; i < 3; i++)
			OTP += r.nextInt(10);
		
		for(int i = 0; i < 3; i++)
			OTP += new Character((char) (r.nextInt(26) + 97));
		
		return OTP;
	}
}
