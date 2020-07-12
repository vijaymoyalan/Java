package activityThree2;

import java.util.HashSet;
import java.util.Set;

public class HashExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hs = new HashSet<>();
		hs.add("One");
		hs.add("Two");
		hs.add("Three");
		hs.add("Four");
		hs.add("Five");
		hs.add("Six");
		hs.add("Six");
		
		for(String x: hs)
			System.out.println(x);
			
		
		System.out.println("The size of hash set is "+hs.size());   // Printing the size of hash set
		
		hs.remove("Three");		// element removal by index
		hs.remove("ABC");	// element removal by name
		System.out.println("Check if Nine is present in list ? "+hs.contains("Nine"));	// to check for a value in set
		
		System.out.println("The updated size of hast set is "+hs.size());
		
		

	}

}
