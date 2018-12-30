package hashmap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMap {
public static void main(String[] args) {
	HashMap<Integer,String> map=new HashMap<>();
	map.put(110,"aakash");
	map.put(111,"Dev");
	map.putIfAbsent(112,"Dev");
	
	for (Entry<Integer, String> set:map.entrySet()) {
		System.out.println(set.getKey()+" "+set.getValue());
	}
	System.out.println("\n\n");
	
	
	System.out.println(map.values());
	Object[] obj=map.values().toArray();
	for (Object object : obj) {
		System.out.println(object.toString());
	}
	
	for (Entry<Integer, String> set:map.entrySet()) {
		System.out.println(set.getKey()+" "+set.getValue());
	}
	
}
}
