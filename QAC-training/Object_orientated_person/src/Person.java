import java.util.Objects;

public class Person {

    private String FullName;
    private short Age;
    private String Job_Title;

    public Person() {
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public short getAge() {
        return Age;
    }

    public void setAge(short age) {
        Age = age;
    }

    public String getJob_Title() {
        return Job_Title;
    }

    public void setJob_Title(String job_Title) {
        Job_Title = job_Title;
    }


}
