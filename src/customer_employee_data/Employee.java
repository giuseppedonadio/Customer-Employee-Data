package customer_employee_data;

public class Employee extends Person {
	private String ssn;
	
	public Employee() {
		super();
		ssn = "";
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	@Override
    public String getDisplayText() {
		return super.toString() + "Social Security Number: " + ssn + "\n";
	}
}
