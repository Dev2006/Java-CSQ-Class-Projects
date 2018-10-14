package randomClass;

import java.util.Random;

public class GetRandom {
	
	public static void main(String[] args) {
		Random r = new Random();
		
		int range1 = 100;
		int range2 = 0;
		
		while(true) {
			int randInt = r.nextInt(45);
			randInt += 2;
			
			if(randInt > range2) {
				range2 = randInt;
				System.out.println("range begin : " + range1 + ", range end : " + range2);
			}
			if(randInt < range1) {
				range1 = randInt;
				System.out.println("range begin : " + range1 + ", range end : " + range2);
			}
		}
	}
}
