public class CheckString {

    String compare;
    String WithMe;

    public CheckString(String compare, String WithMe) {
        this.compare = compare;
        this.WithMe = WithMe;
    }

    boolean check_internal () {
        var WithMe = "Potatoes";

        return  compare == WithMe;
    }

    boolean compare() {
        return compare == WithMe;
    }

    public static void main(String[] args) {
        CheckString Potatoes = new CheckString("Potatoes",null        );
        System.out.println(Potatoes.check_internal());

        System.out.println("hello" == "Hello");
    }
}
