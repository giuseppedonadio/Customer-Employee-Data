package customer_employee_data;

public abstract class Person {
	private String firstName;
	private String lastName;
	private String email;
	
	public Person() {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
    public String toString() {
		return "Name: " + firstName + " " + lastName + "\n" + "Email: " + email + "\n";
	}
	
	public abstract String getDisplayText();
}