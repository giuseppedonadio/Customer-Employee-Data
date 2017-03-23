package customer_employee_data;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Person Tester application");
		
		//declare variables
		String choice = "y";
		String selection = "";
		String firstName = "";
		String lastName = "";
		String email = "";
		String userInput = "";
		
		while(choice.equalsIgnoreCase("y")) {
			
			//ask user if wants to create employer or customer account
			selection = Console.getString("Create customer or employee? (c/e): \n");
			
			if(selection.equalsIgnoreCase("c")){
				
				//customer account
				firstName = Console.getString("Enter First Name: \n");
				lastName = Console.getString("Enter Last Name: \n");
				email = Console.getString("Enter Email Address: \n");
				userInput = Console.getString("Please enter Customer Number: \n");
				
				Customer c = new Customer();
				c.setFirstName(firstName);
				c.setLastName(lastName);
				c.setEmail(email);
				c.setCustomerNumber(userInput);
				
				Console.displayLine(c.getDisplayText());
				
			}else if(selection.equalsIgnoreCase("e")){
				
				//employer account
				firstName = Console.getString("Enter First Name: \n");
				lastName = Console.getString("Enter Last Name: \n");
				email = Console.getString("Enter Email Address: \n");
				userInput = Console.getString("Please enter Social Security Number: \n");
				
				Employee e = new Employee();
				
				e.setFirstName(firstName);
				e.setLastName(lastName);
				e.setEmail(email);
				e.setSsn(userInput);
				
				Console.displayLine(e.getDisplayText());
				
			}else{
				Console.displayLine("Please select customer or employee (c/e):");
				continue;
			}		
			
			//ask user if wants to continue
			choice = Console.getString("Do you want to continue? (y/n) \n");
		}
		Console.displayLine("Bye");

	}

}
