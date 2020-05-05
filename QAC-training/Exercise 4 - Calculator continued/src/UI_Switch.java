import java.util.Scanner;
import static java.lang.System.out;

public class UI_Switch {

    int num1;
    int num2;
    String symbol;
    Scanner in = new Scanner(System.in);

    public UI_Switch() {
    }

    public void UI() {



//        this.num1 = Integer.parseInt(in.next());
//        this.symbol = in.next();
//        this.num2 = Integer.parseInt(in.next());

        boolean try_again = true;
        do {

            out.println("Enter calculation:");

            try {
                this.num1 = Integer.parseInt(in.next());
                this.symbol = in.next();
                this.num2 = Integer.parseInt(in.next());

                try_again= false;
            } catch (Exception e) {
                out.println("Error try again");
            }

        } while (try_again);


        //in.close();

        Switch(num1, num2, symbol);
    }

    private static void Switch(int num1, int num2, String symbol){

        Calculator Calculator_obj = new Calculator();

        int output;

        switch (symbol) {
            case "+":
                output = Calculator_obj.add(num1,num2);
                break;
            case "-":
                output = Calculator_obj.subtract(num1,num2);
                break;
            case "*":
                output = Calculator_obj.multiply(num1,num2);
                break;
            case "/":
                output = Calculator_obj.divide(num1,num2);
                break;
            default:
                out.println("Error try again");
                output = 0;
                break;
        }
        out.println("Answer: " + output);
    }


    public static void main(String[] args) {

        boolean running = true;

        UI_Switch UI_obj = new UI_Switch();

        while (running) {
            UI_obj.UI();
        }


        //out.println("What would you like to do \n1 for add\n2 for subtract\n3 for multiply \n4 for divide.");
    }
}
