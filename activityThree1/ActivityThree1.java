package activityThree1;

import java.util.ArrayList;

public class ActivityThree1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> myList = new ArrayList<>();
		myList.add("Vijay");
		myList.add("Anand");
		myList.add("Tony");
		myList.add("Joy");
		myList.add("Paul");
		for(String x: myList)					// Printing name from the list
			System.out.println("Names added in List is "+x);	
		
		System.out.println("Is name Joy present in the list - "+myList.contains("Joy"));
			
		String get = myList.get(2);				//  to retrive a name from the list
		System.out.println("What is the 3rd name in the ArrayList - "+get);
		
		int size = myList.size();				// to calculate the size of the list
		System.out.println("The size of array List is "+size);
		
		myList.remove(2);   					// removing a name from the list
		
		int size1 = myList.size();
		System.out.println("The new size after removal is "+size1);
	}

}
