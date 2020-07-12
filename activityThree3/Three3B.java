package activityThree3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Three3B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<String> dq = new ArrayDeque<>();
		
	// adding elements to deque	
		dq.add("cat");
		dq.add("dog");
		dq.add("tiger");
		dq.add("lion");
		dq.add("goat");
		dq.add("fish");
		
	// values in dequeu 
        Iterator<String> iterator = dq.iterator();
        while (iterator.hasNext()) 
        { 
        	System.out.println("element in queue is "+iterator.next());
        }
		
	// peek for head and tail
		System.out.println("the first element is "+ dq.peekFirst());
		System.out.println("the last element is "+ dq.peekLast());
		
	// value check
		System.out.println("Is animal Wolf present ? "+dq.contains("Wolf"));
		
	// removal of first and last element
		dq.removeFirst();
		dq.removeLast();
		
	// size of queue
		System.out.println("the size of queue after removal is "+dq.size());
	
	// print the elements
		for(String x:dq)
			System.out.println("Elements are "+x);
	}

}
