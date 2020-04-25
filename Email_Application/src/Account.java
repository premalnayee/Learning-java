import java.util.Scanner;
import java.util.HashMap;

public class Account {
    private String firstname;
    private String lastname;
    private String email;
    private String department;
    private String pasword;
    private int mailbox_capacity;
    private String alternate_email;

    Account(String firstname, String lastname, String department,String password, int mailbox_capacity, String alternate_email){

        this.setFirstname(firstname);
        this.setLastname(lastname);
        this.setDepartment(department);
        this.setPasword(password);
        this.setMailbox_capacity(mailbox_capacity);
        this.setAlternate_email(alternate_email);

        email = firstname + "." + lastname + "@" + department + ".tesla.com";
    }

    public void displayName(){
        System.out.println(firstname + " " + lastname);
    }

    public void displayEmail(){
        System.out.println(email);
    }

    public void displayMailbox_capacity(){
        System.out.println(mailbox_capacity);
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public int getMailbox_capacity() {
        return mailbox_capacity;
    }

    public void setMailbox_capacity(int mailbox_capacity) {
        this.mailbox_capacity = mailbox_capacity;
    }

    public String getAlternate_email() {
        return alternate_email;
    }

    public void setAlternate_email(String alternate_email) {
        this.alternate_email = alternate_email;
    }
}
