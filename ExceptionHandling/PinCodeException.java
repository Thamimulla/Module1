package day8;

public class PinCodeException extends Exception {
	private String excMsg = "";

	public PinCodeException() {
		super();
		
	}

	public PinCodeException(String message) {
		super(message);
		this.excMsg = message;
	}

	@Override
	public String toString() {
		return "PinCodeException :- "+excMsg;
	}
	

}
