package customer_employee_data;

public class Customer extends Person {
	private String customerNumber;
	
	public Customer() {
		super();
		customerNumber = "";
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	
	@Override
    public String getDisplayText() {
		return super.toString() + "Customer Number: " + customerNumber + "\n";
	}

}

