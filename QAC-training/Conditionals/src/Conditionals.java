public class Conditionals {

    private int add(int num1, int num2) {
        return num1 + num2;
    }

    private int multiply(int num1, int num2){
        return num1 * num2;
    }

    void Input(int num1, int num2, boolean method){

        if (method) {
            System.out.println(add(num1, num2));
        } else if (!(method)) {
            System.out.println(multiply(num1, num2));
        }
    }

    void Even(int num1, int num2, boolean method){

        if (num1 % 2 == 0 || num2 % 2 == 0) {
            System.out.println(0);
        } else {
            Input(num1,num2, true);
        }

    }

    public static void main(String[] args) {
        Conditionals conditionals_obj = new Conditionals();

        conditionals_obj.Input(1,2,true);
        conditionals_obj.Input(1,2,false);

        conditionals_obj.Even(1,2,false);
        conditionals_obj.Even(1,1,false);
    }
}
