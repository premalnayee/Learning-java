import java.util.Scanner;

public class Email {
    public boolean running;

    Email() {

    }

    private void UI(){


        running = true;

        while(running){
            System.out.println("Hi");
            System.out.println("What would you like to do?");
            System.out.println("1 to Create account \n 2 to change things (password, mailbox capacity or email address \n 3. to display things (name, email or mailbox capacity");

            Scanner in = new Scanner(System.in);

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
                default:
                    System.out.println("Error try again");
                    break;

            }
        }
    }

    void createAccount(){
        // Used to create new account with Account and input into the hashmap


    }

    void changing(){
        // Display the options that can change things

    }

    void displaying(){
        // Display the options that display things


    }
}
