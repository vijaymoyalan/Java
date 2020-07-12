package JavaActivity1;

public class Car {
	// adding variable to the class Car
		String color;
	    String transmission;
	    int make;
	    int tyres;
	    int doors;
	    
	    Car() {  // constructor declaration
	    	tyres=4;
	    	doors=4;
	    }
	    
	    public void displayCharacteristics() {      // method for display
	    	System.out.println("The color of the car "+color);
	    	System.out.println("The transmission of the car "+transmission);
	    	System.out.println("The make of the car "+make);
	    	System.out.println("The tyres on the car "+tyres);
	    	System.out.println("The doors on the car "+doors);    	
	    }
	    
	    public void accelarate() {
	    	System.out.println("Car is moving forward.");    	
	    }
	    
	    public void brake() {
	    	System.out.println("Car has stopped.");    	
	    }

}
