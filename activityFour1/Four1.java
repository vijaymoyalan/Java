package activityFour1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Four1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> List = new ArrayList<>();
		Random indexGen = new Random();
		// creating Scanner Class
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter integers please ");
        System.out.println("(EOF or non-integer to terminate): ");
        
		while(scn.hasNextInt())
		{
		    List.add(scn.nextInt());
		}
		
		Integer nums[] = List.toArray(new Integer[0]);
		int index = indexGen.nextInt(nums.length);
		System.out.println("Index value generated: " + index);
        System.out.println("Value in arary at generated index: " + nums[index]);
        
        scn.close();

	}

}
