import javax.annotation.processing.SupportedSourceVersion;

public class Ex2_appendixC {

    void start(){

        for (int A = 100; A <= 200 ; A++) {
            if ( A % 2 == 0) {
                System.out.println("-");
            } else {
                System.out.println(" * ");
            }
        }
    }

    public static void main(String[] args) {
        Ex2_appendixC object = new Ex2_appendixC();

        object.start();
    }
}
