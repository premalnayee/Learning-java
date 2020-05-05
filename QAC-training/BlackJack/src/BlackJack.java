import static java.lang.System.*;

public class BlackJack {

    int play(int num1, int num2){
        boolean bol1 = over_21(num1);
        boolean bol2 = over_21(num2);

        if (bol1 && bol2) {
            return 0;

        } else if (bol1 && !bol2) {
            return num2;

        } else if (!bol1 && bol2) {
            return num1;

        } else if (!bol1 && !bol2) {
            if (distance_21(num1) < distance_21(num2)) {
                return num1;

            } else if (distance_21(num1) >= distance_21(num2)) {
                return num2;
            }
        } else {
            return 404;
        }

        return 404;
    }

    void printPlay(int num1, int num2) {
        out.println(play(num1, num2));
    }

    boolean over_21(int num){
        return num > 21;
    }

    int distance_21(int num){
        return 21 - num;
    }

    public static void main(String[] args) {
        BlackJack object1 = new BlackJack();

        object1.printPlay(1,6);
        object1.printPlay(5,6);
        object1.printPlay(21,22);

    }
}
