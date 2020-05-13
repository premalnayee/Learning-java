import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.Integer;

public class PrintNumbers {

    private static Object Integer;

    static void PrintArrange(int start, int stop) {
        // Prints all the integers between start and stop (inclusive)

        for (int i=start; i < stop + 1 ; i++) {
            System.out.println(i);
        }
    }

    static void range1_10() {
        PrintArrange(1,10);
    }

    static void range100_999() {
        PrintArrange(100,999);
    }

    static void collectDigits(int number1, List<Integer> digits_arr) {
        if (number1 / 10 > 0 ){
            collectDigits(number1/10, digits_arr);
        }
        digits_arr.add(number1 % 10);
    }

    static Integer[] getDigits(int number) {

        List<Integer> digits_arr = new ArrayList<Integer>();
        collectDigits(number,digits_arr);
        return digits_arr.toArray(new Integer[]{});
    }

    static String PrintWordArrange(int small_num) {

        String[] numNames1 ={
                "",
                " one",
                " two",
                " three",
                " four",
                " five",
                " six",
                " seven",
                " eight",
                " nine",
                " ten",
                " eleven",
                " twelve",
                " thirteen",
                " fourteen",
                " fifteen",
                " sixteen",
                " seventeen",
                " eighteen"
        };

        String[] numTens = {
                "",
                " ten",
                " twenty",
                " thirty",
                " forty",
                " fifty",
                " sixty",
                " seventy",
                " eighty",
                " ninety"
        };


            if (0 < small_num && small_num < 20) {
                return numNames1[small_num];

            } 
            else if (20 <= small_num && small_num < 100) {
                Integer[] digits_sep = getDigits(small_num);
                return numTens[digits_sep[0]] + numNames1[digits_sep[1]];
            } 
            else if ( 100 <= small_num && small_num < 1000) {
	            Integer[] digits_sep = getDigits(small_num);
	
	            if (small_num % 100 == 0) {
	                return numNames1[ digits_sep[0] ] + " hundread";
	
	            } else {
	                String last_2_digits_str = digits_sep[1].toString() + digits_sep[2].toString();
	                int last_2_digits;
	                last_2_digits = java.lang.Integer.parseInt(last_2_digits_str);
	                return  numNames1[ digits_sep[0] ] + " and " ; // not yet complete
	            }
	
	        } else {
            return "error 404 that number is unsupported";
        }

    }


    public static void main(String[] args) {
        //PrintArrange(1,19);

        System.out.println(PrintWordArrange(1));
        System.out.println(PrintWordArrange(15));
        System.out.println(PrintWordArrange(74));
        System.out.println(PrintWordArrange(60));
        System.out.println(PrintWordArrange(15));
    }
}
