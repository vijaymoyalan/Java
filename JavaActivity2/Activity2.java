package JavaActivity2;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {10, 77, 10, 54, -11, 10};
		int i = num.length;
		System.out.println("Length of the array is "+i);

		int k=0;
		for (int x:num)
		{
			if (x==10)
			k+=10;
		} 
		System.out.println("Sum of all 10's in array is "+k);
	}

}
