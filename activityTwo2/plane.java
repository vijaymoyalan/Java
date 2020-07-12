package activityTwo2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class plane {
	
	private int maxPassengers;
	private List<String> passengers;
	String passenger;
	private Date lastTimeLanded;
	private Date lastTimeTookOf;

	public plane(int maxPassengers)
	{
		  this.maxPassengers = maxPassengers;
	      this.passengers = new ArrayList<>();
	}
	
	public void onboard(String Passanger)
	{
		this.passengers.add(passenger);
	}
	
	public Date takeOff()
	{
		this.lastTimeTookOf  = new Date();
		return lastTimeTookOf;		
	}
	
	public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    public List<String> getPassengers() {
        return passengers;
    }
	
	public void land()
	{
		this.lastTimeLanded = new Date();
		this.passengers.clear();
	}

}
