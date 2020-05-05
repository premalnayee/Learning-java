import java.util.Scanner;
import static java.lang.System.out;

public class Runner {

    public static void main(String[] args) {


        out.println("Enter 2 numbers");

        Scanner in = new Scanner(System.in);
        Integer a = in.nextInt();
        Integer b = in.nextInt();

        out.println("What would you like to do \n1 for add\n2 for subtract\n3 for multiply \n4 for divide.");

        int output;

        switch (in.nextInt()) {
            case 1:
                output = Calculator.add(a,b);
                break;
            case 2:
                output = Calculator.subtract(a,b);
                break;
            case 3:
                output = Calculator.multiply(a,b);
                break;
            case 4:
                output = Calculator.divide(a,b);
                break;
            default:
                out.println("Error try again");
                output = 0;
                break;
        }

        out.println(output);
    }
}
