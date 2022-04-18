package activities;

import java.util.HashMap;
import java.util.Map;


public class Activity11 {
public static void main(String[] args) {
	
	Map<Integer, String> colours = new HashMap<Integer,String>();
	colours.put(1,"Green");
	colours.put(2,"Red");
	colours.put(3,"Blue");
	colours.put(6,"Yellow");
	colours.put(7,"Violet");
	System.out.println("Map before removal of elements:" +colours.entrySet());
	colours.remove(6);
	System.out.println("Green is present in Map :" +colours.containsValue("Green"));
	System.out.println("Size of the Map is :" +colours.size());
	System.out.println("Map after removal of elements:" +colours.entrySet());
}
}
