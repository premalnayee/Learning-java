import java.util.ArrayList;
import java.util.List;
import java.lang.Integer;

public class PrintNumbers {


    static ArrayList<String> PrintArrangeArray(int start, int stop) {
        // Prints all the integers between start and stop (inclusive)
    	ArrayList<String> outputNumbersList = new ArrayList<>();
    	
        for (int i=start; i <= stop ; i++) {
            outputNumbersList.add(PrintWordArrange(i));
        }
        return outputNumbersList;
    }
    
    static String PrintArrangeStr(int start, int stop) {
    	return String.join(",", PrintArrangeArray(start, stop)).stripIndent();
    }

    static void range1_10() {
        PrintArrangeArray(1,10);
    }

    static void range100_999() {
        PrintArrangeArray(100,999);
    }

    static void collectDigits(int number1, List<Integer> digits_arr) {
        if (number1 / 10 > 0 ){
            collectDigits(number1/10, digits_arr);
        }
        digits_arr.add(number1 % 10);
    }

    // Input: integer 
    // Output: array list of each digit in the integer
    static Integer[] getDigits(int number) {
        List<Integer> digits_arr = new ArrayList<Integer>();
        collectDigits(number,digits_arr);
        return digits_arr.toArray(new Integer[]{});
    }

    static String PrintWordArrange(int num) {

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
        	// Get array of digits
        	Integer[] digits_sep = getDigits(num);
        	
        	// Check to see how big the number is and what to do with it
        	// if 0 < num < 20 then return the word from the above array
            if (0 < num && num < 20) {
                return numNames1[num];

            } // if 20 <= num < 100 then return first digit as a word and concatenate the second digit as a word
            else if (20 <= num && num < 100) {
                return numTens[digits_sep[0]] + numNames1[digits_sep[1]];
            
            } // if 100 <= num < 1000 then 
            else if ( 100 <= num && num < 1000) {
            	
            	// if num is a hundread then return first digit as a word + " hundread"
	            if (num % 100 == 0) {
	                return numNames1[ digits_sep[0] ] + " hundread";
	            
	            // else return the first digit as a word + " hundread" + second digit as a word + third digit as a word
	            } else {
	                return  numNames1[ digits_sep[0] ] + " hundread" + " and" + numTens[digits_sep[1]] + numNames1[digits_sep[2]]; // not yet complete
	            }
	
	        } else {
            return "error 404 that number is unsupported";
        }

    }


    public static void main(String[] args) {
        //PrintArrange(1,19);

//        System.out.println(PrintWordArrange(1));
//        System.out.println(PrintWordArrange(15));
//        System.out.println(PrintWordArrange(74));
//        System.out.println(PrintWordArrange(60));
//        System.out.println(PrintWordArrange(15));
    	
    }
}
