
public class OverException extends RuntimeException {
	public OverException(String msg) {
		super(msg);
	}
	
	public OverException(Exception ex) {
		super(ex);
	}
}
