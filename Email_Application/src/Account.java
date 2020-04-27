public class Account {
    private String firstname;
    private String lastname;
    private String email;
    private String department;
    private String pasword;
    private int mailbox_capacity = 1000;  // Default mailbox capacity
    private String alternate_email;

    Account(){
    }

    public void displayName(){
        System.out.println(firstname + " " + lastname);
    }

    public void displayEmail(){
        System.out.println(getEmail());
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

    public void setPasword() {
        this.pasword = randomPassword();
    }

    private String randomPassword(){
        int length = 8;
        String passwordSet = "ABCEDEFGHIJKLMNOPQRSTUVWXYZ012345678";

        char[] password = new char[length];
        for (int i=0; i <length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
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

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        this.email  = this.firstname + "." + this.lastname + "@" + department + ".tesla.com";
    }
}
