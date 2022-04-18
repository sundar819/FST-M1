package activities;

public class Activity2 {
	
	public static void main(String[] args) {
		//initialize array
		int [] array1 = {10, 77, 10, 54, -11, 10};
		int sum=0;
		//find 10 n array and add them
		for(int i=0;i<array1.length;i++)
		{
			if(array1[i]==10)
			{
								sum= sum + array1[i];
								
			}
			
		}
		//condition should be true if sum is 30 else false
		if(sum==30)
		{
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		
}
}
