
public class EmptyFieldException extends Exception {
	// Default constructor
	public EmptyFieldException() {}
	
	// constructor with custom message
	public EmptyFieldException(String custom_message) {
		super(custom_message);
	}
}
