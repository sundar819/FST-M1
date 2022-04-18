package activities;

public class Car {
	String color;
	String Transmission;
	int make;
	int tyres;
	int doors;
	
	public Car ()
	{
		 tyres =4;
		doors=4;
	}

	public void displayCharacteristics()
	{
	System.out.println(color);
	System.out.println(Transmission);
	System.out.println(make);
	System.out.println(tyres);
	System.out.println(doors);
	}
	public void accelarate()
	{
		System.out.println("Car is moving forward.");
	}
	
	public void brake()
	{
		System.out.println("Car has stopped.");
	}
}
