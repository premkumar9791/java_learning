package try_catch;

public class OldAgeException  extends Exception{

	String msg;

	public OldAgeException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "OldAgeException [msg=" + msg + "]";
	}
	
	
}
