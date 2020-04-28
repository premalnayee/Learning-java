import java.util.Scanner;
import java.util.HashMap;

public class Email {
    boolean running;

    HashMap<String, Account> email_database;

    Email() {
        email_database = new HashMap<String, Account>();
    }

    public void UI(){
        Scanner in = new Scanner(System.in);

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
        Scanner in = new Scanner(System.in);

        // Instance of email Account to store fields
        Account Email_account_instance = new Account();

        System.out.println("==".repeat(10));
        System.out.println("Account creator");
        System.out.println("==".repeat(10));

        System.out.println("What is your first name?");     // Set first name
        String FirstName = in.nextLine();
        Email_account_instance.setFirstname(FirstName);

        System.out.println("What is your last name?");      // Set Last name
        String LastName = in.nextLine();
        Email_account_instance.setLastname(LastName);

        Email_account_instance.generateEmail();                  // Will automatically generate email from first and last name

        System.out.println("What is your department?");

        String Department = in.nextLine();
        Email_account_instance.setDepartment(Department);

        Email_account_instance.randomPassword();                // Generate random password

        System.out.println("What is your alternate Email?");  // Set alternate email
        String AlternateEmail = in.nextLine();
        Email_account_instance.setAlternate_email(AlternateEmail);

        System.out.println("Your unique ID is: " + Unique_key()); // Display unique ID
        System.out.println("Your password is: " + Email_account_instance.getPassword()); // Print password

        email_database.put(Unique_key(), Email_account_instance);
    }

    String Unique_key(){
        int unique = email_database.size() + 1;
        return String.valueOf(unique);
    }

    void changing(){
        // Display the options that can change the following things: password, mailbox capacity or email address
        Scanner in = new Scanner(System.in);

        System.out.println("What would you like to change?");
        System.out.println("1 to change a password \n2 to change mailbox capacity \n3 to change email address \n4. Back to main menu");

        switch (in.nextInt()) {
            case 1:
                ChangePassword();
                break;
            case 2:
                ChangeMailboxCapacity();
                break;
            case 3:
                ChangeEmailAddress();
                break;
            case 4:
                break;
            default:
                System.out.println("Error try again");
                break;
        }
    }

    String getFromUserID () {
        System.out.println("Enter the ID you would like to change?");
        String ID = in.nextLine();
        return ID;
    }

    void ChangePassword(){
        Scanner in = new Scanner(System.in);


        System.out.println("Enter the new password");
        String NewPassword = in.nextLine();

        email_database.get(getFromUserID()).setPassword(NewPassword);
    }

    void ChangeMailboxCapacity() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the new MailboxCapacity");
        int NewMailboxCapacity = in.nextInt();

        email_database.get(getFromUserID()).setMailbox_capacity(NewMailboxCapacity);
    }

    void ChangeEmailAddress() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the new Email Address");
        String EmailAddress = in.nextLine();

        email_database.get(getFromUserID()).setEmail(EmailAddress);
    }

    void displaying(){
        // Display the options that display things

        Scanner in = new Scanner(System.in);

        System.out.println("What would you like to display?");
        System.out.println("1 for names \n2 for emails \n3 for Mailbox capacities \n4. Back to main menu");

        switch (in.nextInt()) {
            case 1:
                System.out.println(email_database.values());
        }
    }
}
