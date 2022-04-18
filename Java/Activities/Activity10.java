package activities;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {
	
	public static void main(String[] args) {
		
		Set<Object> hs = new HashSet<>();
	     hs.add("Murugan");
	     hs.add(4);
	     hs.add(9.08);
	     hs.add('a');
	     hs.add(7);
	     hs.add("r");
	     System.out.println("Size of hashset before is " + hs.size());
	     hs.remove(9.08);
	     hs.remove(24);
	     System.out.println("Item present in Set :" + hs.contains(9.08));
	     System.out.println("Updated Hashset is " + hs);
	}

}
