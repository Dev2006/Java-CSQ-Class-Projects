package arraylists;

import java.util.ArrayList;
import java.util.Iterator;

public class test2 {
	
	public static void main(String[] args) {
		//Initialization
		ArrayList<Double> list = new ArrayList<Double>();
		
		//Adding values
		Double temp = 1d;
		for(int i = 0; i < 10; i++) {
			list.add(temp);
			temp /= 2;
		}
		
		//Using iterators
		Iterator<Double> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
