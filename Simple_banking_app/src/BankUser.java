// Aim of project: banking application you will be coding the simple bank operations like check balance, deposit, withdraw, exit, etc. 

import java.util.*;

public class BankUser {
	Scanner in = new Scanner(System.in);
	String CustomerID;
	HashMap<String, Account> Customers = new HashMap<>();
	
	void menu() {
		boolean running = true;

		
		// Infinite loop
		while (running) {
			System.out.println("Hi");
			System.out.println("What would you like to do?");
			System.out.println("1. Create account");
			System.out.println("2. Check balanace");
			System.out.println("3. Deposit");
			System.out.println("4. Withdraw");
			System.out.println("5. Exit");
			System.out.println("Please type in an number to select option");
			Scanner in = new Scanner(System.in);
			
			switch(in.nextLine()) {
				case "1":
					CreateAccount();
					break;
				case "2": 
					CheckBalance();
					break;
				case "3":
					Deposit();
					break;
				case "4":
					Withdraw();
					break;
				case "5":
					System.out.println("Goodbye");
					System.exit(0);
				default:
					System.out.println("Error");
					running = false;
					break;
					}
		}
	}
	
	void CreateAccount() {
		// Make accounts by taking in information from terminal and input them into a HashMap (a.k.a relational database) for easier access. Consider how you could autogenerate the CustomerID with a counter or random number generator. Also need to find better way to store balance (currently stored as String which isn't ideal).
		
		System.out.println("What is your first name?");
		String FirstName = in.nextLine();
		
		System.out.println("What is your last name?");
		String LastName = in.nextLine();
		
		System.out.println("How much money would you like to put in?");
		String balance_str = in.nextLine();
		
		System.out.println("What do you want your unique id to be?");
		String CustomerID = in.nextLine();
		
		try {
			float balance = Float.parseFloat(balance_str);
			Account Customer_parameters = new Account(FirstName, LastName, balance);
			Customers.put(CustomerID, Customer_parameters);
		} catch (NumberFormatException e) {
			System.out.println("Error try again from main menu");
			return;
		}
		
		// String[] Customer_parameters = {FirstName,LastName,balance}; // old
	
		System.out.println("Hi " + Customers.get(CustomerID).FirstName + " your account has been created." + "\n");
		
	}
	
	void CheckBalance() {
		// Hopefully fairly simple, just lookup the customer ID against the HashMap and recall some values
		
		System.out.println("What's your customer ID?");
		String CustomerID = in.nextLine();
		
		System.out.println("Hi " + Customers.get(CustomerID).FirstName + " your balanace is: " + Customers.get(CustomerID).balance + "\n");
	}
	
	void Deposit() {
		// Deposit money into the bank
		
		System.out.println("What's your customer ID?");
		String CustomerID = in.nextLine();
		
		float balance = Customers.get(CustomerID).balance;
		//float balance_float = Float.valueOf(balance);
		
		System.out.println("How much money do you want to deposit?");
		float deposited = in.nextFloat();
		
		//Update the balance
		balance += deposited;
		//balance = String.valueOf(balance_float);
		Customers.get(CustomerID).balance = balance;
				
		System.out.println("You deposited " + deposited + " your current balanace is " + balance + "\n");

	}
	
	void Withdraw() {
		// Withdraw money out of the bank
		
		System.out.println("What's your customer ID?");
		String CustomerID = in.nextLine();
		
		float balance = Customers.get(CustomerID).balance;
		//float balance_float = Float.valueOf(balance);
		
		System.out.println("How much money do you want to withdraw?");
		float withdrawn = in.nextFloat();
		
		//Update the balance
		balance -= withdrawn;
		//balance = String.valueOf(balance_float);
		Customers.get(CustomerID).balance = balance;
				
		System.out.println("You withdrew " + withdrawn + " your current balanace is " + balance + "\n");

	}
	
	
	public static void main(String[] args) {
		
	}

}