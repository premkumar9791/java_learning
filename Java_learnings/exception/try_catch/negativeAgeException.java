package try_catch;

public class negativeAgeException extends Exception {

	String msg;

	public negativeAgeException(String msg) {
		super();
		this.msg = msg;
	}
	

	@Override
	public String toString() {
		return "negativeAgeException [msg=" + msg + "]";
	}
	
}
