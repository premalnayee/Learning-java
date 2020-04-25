import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
		
		boolean running = true;
		
		BankUser start = new BankUser();

		
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
					start.CreateAccount();
					break;
				case "2": 
					start.CheckBalance();
					break;
				case "3":
					start.Deposit();
					break;
				case "4":
					start.Withdraw();
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

}
