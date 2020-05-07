public class Factorials {

    static void printFact(int factorial, int input_facorial){
        System.out.print(factorial + "! = 1");
        for (int i=2 ; i <= factorial; i++){
            System.out.print("*" + i);
        }
        System.out.print("= " + input_facorial + "\n");
    }

    static void fact(int input_factorial) {
        boolean running = true;
        int result = 0;
        int final_factorial;
        int factorial = input_factorial;
        int count = 2;

        while (running) {
            result = factorial / count;

            if (factorial % count != 0) {
                running = false;
                System.out.println(input_factorial + " None");
                return;

            } else if (result == 1) {
                printFact(count,input_factorial);
                return;

            }
            factorial = result;
            count++;
        }

    }

    public static void main(String[] args) {
        fact(6);
        fact(120);
        fact(3628800);
        fact(479001600);
        fact(18);

        }
    }


