package JavaActivity3;

public class Activity1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double seconds = 1000000000;
		double EarthSeconds = 31557600;
		double MercurySeconds = 0.2408467;
		double VenusSeconds = 0.61519726;
		double MarsSeconds = 1.8808158;
		double JupiterSeconds = 11.862615;
		double SaturnSeconds = 29.447498;
		double UranusSeconds = 84.016846;
		double NeptuneSeconds = 164.79132;
		
	
		System.out.println("Age of Earth: "+seconds/EarthSeconds);
		System.out.println("Age of Mercury: "+seconds/EarthSeconds/MercurySeconds);
		System.out.println("Age of Venus: "+seconds/EarthSeconds/VenusSeconds);
		System.out.println("Age of Mars: "+seconds/EarthSeconds/MarsSeconds);
		System.out.println("Age of Jupiter: "+seconds/EarthSeconds/JupiterSeconds);
		System.out.println("Age of Saturn: "+seconds/EarthSeconds/SaturnSeconds);
		System.out.println("Age of Uranus: "+seconds/EarthSeconds/UranusSeconds);
		System.out.println("Age of Neptune: "+seconds/EarthSeconds/NeptuneSeconds);

	}

}
