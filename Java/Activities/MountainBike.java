package activities;

public class MountainBike extends Bicycle {
	public int seatHeight;
 public MountainBike(int gears, int currentSpeed,int newValue) {
		super(gears, currentSpeed);
		seatHeight = newValue;
		// TODO Auto-generated constructor stub
	}


	
	
	public String bicycleDesc() {
	
			return (super.bicycleDesc() + "\nSeat height is " + seatHeight);
	  
	}
}
