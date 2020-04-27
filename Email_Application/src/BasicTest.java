import java.util.HashMap;

public class BasicTest {

    public static void main(String[] args){
        //Email cus = new Email();
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        //System.out.println("HI");
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        System.out.println(capitalCities);

        Account instance = new Account();

        instance.setFirstname("james");
        System.out.println(instance);

        //Account instance = new Account();

        System.out.println(instance);

    }
}
