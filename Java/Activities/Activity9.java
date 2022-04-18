package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {
	
	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();
		myList.add("Murugan");
		myList.add("Kandhan");
		myList.add("Velan");
		myList.add("Skandhan");
		myList.add("Saravanan");
		for(String names: myList)
		{
			System.out.println( names);
		}
		System.out.println("3rd Name in the Array is: " +myList.get(2));
		System.out.println("Is the name Velan present in the array: "+ myList.contains("Velan"));
		System.out.println("Before removal of one name the size is: " +myList.size());
		myList.remove("Skandhan");
		System.out.println("After removal of one name the size is: " +myList.size());
	}

}
