package activities;

public class Activity8 {
	public static void main(String[] a) {
		Activity8 act = new Activity8();
		try {
			act.exceptionTest(null);
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	try {
		act.exceptionTest("test");
	} catch (CustomException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
	
	public void exceptionTest(String s) throws CustomException
	{
		if(s==null)
		{
			throw new CustomException("String value is null!!");
		}
		
		else 
		{
			System.out.println("String value is " +s);
		}
	}

}
