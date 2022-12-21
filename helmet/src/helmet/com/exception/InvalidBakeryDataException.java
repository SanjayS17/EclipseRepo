package helmet.com.exception;

public class InvalidBakeryDataException  extends Exception{
	
	public InvalidBakeryDataException() {
		
	}
	
	public InvalidBakeryDataException(String text) {
		super(text);
	}

}
