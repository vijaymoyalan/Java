package activityTwo4;

public class CustomException extends Exception {
	private String message;
	
	CustomException(String message)// Constructor calling
	{
		message="Exception message is thrown";
	}
	@Override
	public String getMessage()
	{
		return message;
	}

}
