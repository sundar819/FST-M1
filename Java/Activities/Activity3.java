package activities;

import java.text.DecimalFormat;

public class Activity3 {
	private static final DecimalFormat df = new DecimalFormat("0.00");
public static void main(String[] args) {
	double seconds = 1000000000;

	double EarthSeconds = 31557600;
	double MercurySeconds = 0.2408467;
	double VenusSeconds = 0.61519726;
	double MarsSeconds = 1.8808158;
	double JupiterSeconds = 11.862615;
	double SaturnSeconds = 29.447498;
	double UranusSeconds = 84.016846;
	double NeptuneSeconds = 164.79132;

	
	double earthageinyears=seconds/EarthSeconds;
	System.out.println("Age on Earth" + " is   " +  df.format(earthageinyears) + " Earth years old");
	System.out.println("Age on Mercury" + " is  " + df.format( earthageinyears/MercurySeconds)+ " Earth years old");
	System.out.println("Age on Venus" + " is  " +  df.format(earthageinyears/VenusSeconds)+ " Earth years old");
	System.out.println("Age on Mars" + " is  " +  df.format(earthageinyears/MarsSeconds)+ " Earth years old");
	System.out.println("Age on Jupiter" + " is  " + df.format (earthageinyears/JupiterSeconds)+ " Earth years old");
	System.out.println("Age on Saturn" + " is  " +  df.format(earthageinyears/SaturnSeconds)+ " Earth years old");
	System.out.println("Age on Uranus" + " is  " + df.format (earthageinyears/UranusSeconds)+ " Earth years old");
	System.out.println("Age on Neptune" + " is  " + df.format (earthageinyears/NeptuneSeconds)+ " Earth years old");
}
}
