
public class TestAction {

	private String message;
	
	public String execute() {
		
		System.out.println("Execute() Method is called");
		
		message = "ERROR:: Message";
		return "error";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
