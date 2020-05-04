import java.util.Scanner;

import static java.lang.System.out;

public class Calculator {

    static int add(int a, int b) {
        return a+b;
    }

    static int subtract(int a, int b){
        return a-b;
    }

    static  int multiply(int a,int b){
        return a*b;
    }

    static int divide(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {

        out.println("Enter 2 numbers");

        Scanner in = new Scanner(System.in);

        int num1 = Integer.parseInt(in.next());
        String symbol = in.next();
        int num2 = Integer.parseInt(in.next());


        //out.println("What would you like to do \n1 for add\n2 for subtract\n3 for multiply \n4 for divide.");

        int output;

        switch (symbol) {
            case "+":
                output = add(num1,num2);
                break;
            case "-":
                output = subtract(num1,num2);
                break;
            case "*":
                output = multiply(num1,num2);
                break;
            case "/":
                output = divide(num1,num2);
                break;
            default:
                out.println("Error try again");
                output = 0;
                break;
        }

        out.println(output);
    }
}
