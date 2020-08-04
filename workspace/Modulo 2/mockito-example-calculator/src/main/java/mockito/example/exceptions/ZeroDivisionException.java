package mockito.example.exceptions;

public class ZeroDivisionException extends Exception{
	
	private String message;
	
	public ZeroDivisionException() {
		this.message = "No se puede dividir por cero";
	}
	
	public String getMessage() {
		return message;
	}

}
