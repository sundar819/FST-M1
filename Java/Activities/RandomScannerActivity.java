package activities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomScannerActivity {
	static List<Integer> numberarray;
	public static void main(String[] args) {
		 List <Integer> list= new ArrayList<>();
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter number1");
        int n1 = scan.nextInt();
  
        System.out.println("You entered number1 is :" + n1);
        list.add(n1);
        System.out.println("Enter number2");
        int n2 = scan.nextInt();
        
        System.out.println("You entered number1 is :" + n2);
        list.add(n2);
        System.out.println("Enter number3");
        int n3 = scan.nextInt();
      
        System.out.println("You entered number1 is :" + n3);
        list.add(n3);
        System.out.println(list);

        Object[] I1 = list.toArray();
        for (Object obj : I1)
        {
    		System.out.println("Array is :"+obj);
    }

		System.out.println("Array length is: " +I1.length);
		Random indexGen = new Random();
		int random_no=indexGen.nextInt(I1.length);
		System.out.println("Random number Index generated is :" +random_no);
		System.out.println("Array Element of that random number index  is:" +I1[random_no]);
		scan.close();
	}
	

}
