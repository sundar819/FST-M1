package activities;

public class Activity7 {
	public static void main(String[] args) {
		MountainBike bike1 = new MountainBike(3,30,25);
		System.out.println(bike1.bicycleDesc());
		bike1.applyBrake(5);
		bike1.speedUp(10);
	}

}
