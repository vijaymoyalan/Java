package activityTwo4;

public class ActivityTwo4 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try 
		{
			ActivityTwo4.exceptionTest("Will print to console");
			ActivityTwo4.exceptionTest(null);
			ActivityTwo4.exceptionTest("Won't execute");
        } 
		
		catch(CustomException err) 
		{
            System.out.println("Inside catch block: " + err.getMessage());
        }
	}
		
		static void exceptionTest(String str) throws CustomException 
		{
	        if(str == null) 
	        {
	            throw new CustomException("String value is null");
	        } 
	        else 
	        {
	            System.out.println(str);
	        }
		}
	}
