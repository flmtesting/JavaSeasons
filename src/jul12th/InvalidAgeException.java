package jul12th;

public class InvalidAgeException extends RuntimeException {
	
	public InvalidAgeException()
	{
		super("Invalid age..not eligible for registration..");
	}

}
