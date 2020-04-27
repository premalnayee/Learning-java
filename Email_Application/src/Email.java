import java.util.Scanner;
import java.util.HashMap;

public class Email {
    boolean running;
    Scanner in = new Scanner(System.in);
    HashMap<String, Account> email_database;

    Email() {
        email_database = new HashMap<String, Account>();
    }

    public void UI(){

        running = true;

        while(running){
            System.out.println("Hi");
            System.out.println("What would you like to do?");
            System.out.println("1 to Create account \n2 to change things (password, mailbox capacity or email address \n3. to display things (name, email or mailbox capacity \n4. Exit");

            switch (in.nextInt()) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    changing();
                    break;
                case 3:
                    displaying();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Error try again");
                    break;

            }
        }
    }

    void createAccount(){
        // Used to create new account with Account and input into the hashmap

        // Instance of email Account to store fields
        Account Email_account_instance = new Account();

        System.out.println("==".repeat(10));
        System.out.println("Account creator");
        System.out.println("==".repeat(10));

        System.out.println("What is your first name?");     // Set first name
        Email_account_instance.setFirstname(in.nextLine());

        System.out.println("What is your last name?");      // Set Last name
        Email_account_instance.setLastname(in.nextLine());

        Email_account_instance.setEmail();                  // Will automatically generate email from first and last name

        System.out.println("What is your department?");
        Email_account_instance.setDepartment(in.nextLine());

        Email_account_instance.setPasword();                // Generate random password

        System.out.println("What is your alternate Email?");  // Set alternate email
        Email_account_instance.setAlternate_email(in.nextLine());

        System.out.println("Your unique ID is: " + Unique_key()); // Display unique ID
        System.out.println("Your password is: " + Email_account_instance.getPasword()); // Print password

        email_database.put(Unique_key(), Email_account_instance);
    }

    String Unique_key(){
        int unique = email_database.size() + 1;
        return String.valueOf(unique);
    }

    void changing(){
        // Display the options that can change things

    }

    void displaying(){
        // Display the options that display things


    }
}
