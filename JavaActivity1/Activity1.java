package JavaActivity1;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java");
		Car BMW = new Car();
		BMW.make=2014;
		BMW.color="Black";
		BMW.transmission="Manual";
		
		
		// calling the methods of class Car
		BMW.displayCharacteristics();
		BMW.accelarate();
		BMW.brake();
	}
}