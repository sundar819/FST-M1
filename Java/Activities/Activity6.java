package activities;

public class Activity6 {
	
	public static void main(String[] args) throws InterruptedException {
		Plane plane = new Plane(10);
		plane.onboard("Passenger1");
		plane.onboard("Passenger2");
		plane.onboard("Passenger3");
		plane.onboard("Passenger4");
		plane.onboard("Passenger5");
		plane.onboard("Passenger6");
		plane.onboard("Passenger7");
		plane.onboard("Passenger8");
		plane.onboard("Passenger9");
		plane.onboard("Passenger10");
		System.out.println("Flight take-off time  is   " +plane.takeOff());
		System.out.println("List of Passengers are  " +plane.getPassengers());
		Thread.sleep(5000);
		plane.land();
		System.out.println("Flight landing time is  " +plane.getLastTimeLanded());
	}

}
