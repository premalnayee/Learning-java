import static java.lang.System.out;
import java.util.Scanner;

public class Input {

    Scanner in = new Scanner(System.in);
    int num1;
    int num2;

    public void UI(){
        boolean try_again = true;
        do {

            out.println("Enter calculation:");

            try {
                this.num1 = Integer.parseInt(in.next());
                this.num2 = Integer.parseInt(in.next());

                try_again= false;
            } catch (ArithmeticException e) {
                out.println("Error: Exception in thread \"main\" java.lang.ArithmeticException: / by zero");
            } catch (NumberFormatException e) {
                out.println("Error: Number format exception for Input string");
            } catch (Exception e) {
                out.println("Error: Something went wrong");
            }

            out.println((float) num1/ (float) num2);

        } while (try_again);
    }

    public static void main(String[] args) {
        //out.println(false/5);
        Input calc = new Input();
        calc.UI();
    }
}
