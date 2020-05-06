import java.util.ArrayList;

public class People {

    void Find_person(String compare_name, Person[] person_obj){
        for (Person person_item : person_obj){
            if (person_item.getFullName().equals(compare_name)) {
                System.out.println(
                        "The name is: " + person_item.getFullName() +
                        "\nThe age is: " + person_item.getAge() +
                        "\nThe title is: " + person_item.getJob_Title());
            }
        }
    }



    public static void main(String[] args) {
        Person Andy = new Person();
        Andy.setFullName("Andy");
        Andy.setAge((short) 15);
        Andy.setJob_Title("The kid");

        Person Joker = new Person();
        Joker.setFullName("Joker");
        Joker.setAge((short) 55);
        Joker.setJob_Title("The robber");

        Person Batman = new Person();
        Batman.setFullName("Batman");
        Batman.setAge((short) 30);
        Batman.setJob_Title("The saviour");

        Person[] people_obj_list = new Person[3];

        people_obj_list[0] = Andy;
        people_obj_list[1] = Joker;
        people_obj_list[2] = Batman;


//        for (Person person_item : people_obj){
//            System.out.println( person_item.getFullName() );
//        }

        People user = new People();

        user.Find_person("Joker", people_obj_list);

    }

}
