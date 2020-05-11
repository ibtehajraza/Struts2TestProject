
public class TestAction {

	private String message;
	
	String firstName;
	

	public String execute() {
		
		System.out.println("Execute() Method is called");
		
		message = "SUCCESS: Message, Name: " + firstName;
		System.out.println("Name: "+firstName);
		return "success";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
}
