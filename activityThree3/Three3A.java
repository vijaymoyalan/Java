package activityThree3;

import java.util.LinkedList;
import java.util.Queue;

public class Three3A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> q= new LinkedList<>();
		
	// adding 5 numbers
		q.add("1");
		q.add("2");
		q.add("3");
		q.add("4");
		q.add("5");
		
	// removal of numbers from queue
		q.remove("3");
		
	// the first element
		System.out.println("the first element of queue is "+q.peek());
		
	// size of queue
		System.out.println("the size of queue "+q.size());
		
	// printing the queue
		for(String x:q)
			System.out.println("elements in queue are "+x);
	}

}
