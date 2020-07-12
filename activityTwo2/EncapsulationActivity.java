package activityTwo2;

public class EncapsulationActivity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	//On-boarded Name
		plane plane= new plane(10);
		plane.onboard("Vijay");
        plane.onboard("Anand");
        plane.onboard("Joseph");
        
     //Plane takes off
        System.out.println("Plane took off at: " + plane.takeOff());
       
     //Print list of people on board
        System.out.println("People on the plane: " + plane.getPassengers());
       
     //Flying.....
        Thread.sleep(5000);
        
     //Plane has landed
        plane.land();
        
     //Plane lands
        System.out.println("Plane landed at: " + plane.getLastTimeLanded());
        System.out.println("People on the plane after landing: " + plane.getPassengers());

	}

}
