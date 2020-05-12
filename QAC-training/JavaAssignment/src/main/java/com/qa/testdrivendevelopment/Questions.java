package com.qa.testdrivendevelopment;
import java.util.ArrayList;
import java.util.Arrays;

import java.lang.Integer;

public class Questions {
	/**
	 * EXAMPLE: THIS ONE HAS BEEN DONE FOR YOU <br>
	 * 
	 * Given a name, return "Hi" plus the name <br>
	 * <br>
	 * For Example:<br>
	 * greetingExample("John") → "Hi John" <br>
	 * greetingExample("Matt") → "Hi Matt" <br>
	 * greetingExample("Angelica") → "Hi Angelica"
	 * 
	 */
	public String greetingExample(String name) {
		return "Hi " + name;
	}

	/**
	 * Write a function which takes 2 integers greater than 0, X,Y as input and generates a 2-dimensional array. 
	 * The element value in the i-th row and j-th column of the array should be i*j.  <br>
	 * Note: i=0,1.., X-1; j=0,1,¡­Y-1.  <br>
	 *   <br>
	 * For Example:  <br>
	 * multiply(3,2) → [[0,0,0],[0,1,2]]  <br>
	 * multiply(2,1) → [[0,0]]  <br>
	 * multiply(3,4) → [[0,0,0],[0,1,2],[0,2,4],[0,3,6]]
	 */
	public int[][] multiply(int numOfArrays, int arrayLength){
		int[][] multiArray = new int[arrayLength][numOfArrays];
		
		for (int i=0; i<arrayLength;i++) {
			for (int j=0; j<numOfArrays;j++) {
				multiArray[i][j] = i*j;
			}
		}
		return multiArray;
	}
	
	/**
	 * Write a function that accepts a comma separated sequence of words as input and prints the words in a comma-separated
	 * sequence after sorting them alphabetically.
	 * 
	 * For Example:
	 * sortAlphabetically({"bag","car","dog"}) → {"bag","car","dog"}
	 * sortAlphabetically({"dog","car","bag"}) → {"bag","car","dog"}
	 * sortAlphabetically({"car","bark","bag","dog"}) → {"bag","bark","car","dog"}
	 */
	public String[] sortAlphabetically(String[] wordSequence) {
		Arrays.sort(wordSequence);
		return wordSequence;
	}

	/**
	 * Write a function which takes an input, a, and returns the sum a+aa+aaa+aaaa.
	 * So if 2 was the input, the function should return 2+22+222+2222 which is 2468.
	 * 
	 * For Example:
	 * aPlus(5) → 6170
	 * aPlus(9) → 11106
	 */
	public int aPlus(int num) {
		int sum=0;
		String a = String.valueOf(num);
		String valueAdd = "";
		
		for (int i=1; i<=4; i++) {
			valueAdd += a;
			sum += Integer.parseInt(valueAdd);
		}
		return sum;
	}

	/**
	 * Write a function which takes a string of numbers, separated by commas, and returns all the odd numbers as a string, separated by commas.
	 * If there are no odd numbers then the function should return "null".
	 * 
	 * Inputs will always be given in ascending order, eg "3,4,5". Outputs should also be given in ascending order.
	 * 
	 * For Example:
	 * oddNum("1,2,3,4,5") → "1,3,5"
	 * oddNum("2,4,6,8") → "null"
	 * oddNum("23,48,52,57") → "23,57"
	 */
	public String oddNum(String allNums) {
		int numInt;
		ArrayList<String> oddNumsList = new ArrayList<>();
		
		// Turn the string into an array
		String[] allNumsArray = allNums.split(",");
		
		for (String numString : allNumsArray) {
			numInt = Integer.parseInt(numString);
			
			if (numInt % 2 != 0) { // Check to see if number is odd
				oddNumsList.add( String.valueOf(numInt) );
			}
		}
		
		// Now let's make sure our list has something inside it
		if (oddNumsList.size() == 0) {
			return null;
		} else {
			return String.join(",",oddNumsList);
		}
	}

	/**
	 * Define a function that can accept two strings as input and returns the string of largest length 
	 * 
	 * If two strings have the same length, then the function should return both strings separated by a single space.
	 * In this case, the strings should be returned in the same order in which they were given.
	 * 
	 * For Example:
	 * longString("hi","hello") → "hello"
	 * longString("three", "two") → "three"
	 * longString("three", "hello") → "three hello"
	 */
	public String longString(String input1, String input2) {
		
		if (input1.length() > input2.length()) {
			return input1;
		} else if (input1.length() < input2.length()) {
			return input2;
		} else if (input1.length() == input2.length()) {
			return input1 + " " + input2;
		} else {
			return "Error 404";
		}
	}

	
	/**
	 * Given an email address person@company.com, and a parameter "person" or "company",
	 * write a function which returns the corresponding piece of information.
	 * Your function should ignore case.
	 * 
	 * For Example:
	 * email("john@google.com", "person") → "john"
	 * email("jane@Microsoft.com", "company") → "microsoft"
	 * email("Dave@amazon.com", "person") → "dave"
	 */
	public String email(String email, String parameter) {
		String[] emailSplit = email.split("@|\\.");
		
		String person = emailSplit[0];
		String company = emailSplit[1];
		//String address = emailSplit[2];
		
		switch (parameter) {
		case "person":
			return person.toLowerCase();

		case "company":
			return company.toLowerCase();

		default:
			return "Error 404";
		}
	}

	/**
	 * 	The fibonacci sequence is the sum of the last two numbers, 
	 * 	with index 0 and 1 having a value of 0 and 1 respectively
	 * 
	 * So fibonacci(5) is the sum of fibonacci(4) + fibonacci(3)
	 * 
	 * For Example:
	 * fibbonaci(0) → 0
	 * fibbonaci(1) → 1
	 * fibbonaci(2) → 1
	 * fibbonaci(3) → 2
	 * fibbonaci(4) → 3
	 * fibbonaci(5) → 5
	 * fibbonaci(8) → 21
	 */
	public int fibonacci(int num) {
		if (num == 0) { return 0; }
		if (num == 1) { return 1; }
		
		return fibonacci(num - 1) + fibonacci(num - 2);
	}


	/**
	 * Write a function which, given a string input, returns a string which contains only the characters with odd indexes.
	 * 
	 * For Example:
	 * oddLetters("Sponge") → "pne"
	 * oddLetters("hi") → "i"
	 * oddLetters("0H1e2l3l4o5w6o7r8l9d") → "Helloworld"
	 */
	public String oddLetters(String input) {
		StringBuilder oddLetterStr = new StringBuilder();
		for (int i=1; i<input.length(); i+=2) { // Iterating from 1 to length of string (odd numbers are spaced two apart)
			oddLetterStr.append(input.charAt(i));
		}
		return oddLetterStr.toString();
	}


	/**
	 * Write a function which solves the following puzzle.
	 * A farm has chickens and rabbits, and scanners are able to detect the number of heads and legs.
	 * How many chickens do we have, if we know the number of heads and legs?
	 * The values for 'heads' and 'legs' will be inputs.
	 * If there are no solutions to the puzzle, return null
	 * 
	 * For Example:
	 * chickenAndRabbits(35, 94) → 23
	 * chickenAndRabbits(2, 6) → 1
	 * chickenAndRabbits(12,63) → null
	 */
	public Integer chickenAndRabbits(int heads, int legs) {
		float numChickens;
		
		try {
			numChickens = (int) (2*heads - 0.5*legs);
		} catch (ArithmeticException e) {
			return null;
		}
		
		if (numChickens >= 0 ) {
			return (int) numChickens;
		} else {
			return null;
		}
	}


	/**
	 * Write a function which checks the validity of a credit card number.
	 * The function should return a boolean, True if the card is valid, or False if it is not.
	 * 
	 * A credit card has a valid number if it satisfies the following criteria.
	 * - it must start with a 4, 5 or 6.
	 * - it must contain exactly 16 digits.
	 * - each digit must be 0-9 inclusive.
	 * - it may contain hyphens ("-"), to separate groups of 4 digits only, but it cannot contain any other characters.
	 * - it must not have 4 or more consecutive repeated digits.
	 * 
	 * For Example:
	 * validCard("4012-3456-7890-1234") → True
	 * validCard("0123-4567-8901-2345") → False
	 * validCard("401234567890123") → False
	 * validCard("4012 3456 7890 1234") → False
	 * validCard("4444-0123-4567-8901") → False
	 * validCard("4012345678901234") → True
	 */
	
	private static boolean validCardCheckFirst(String cardNumber) {
		int firstCardNum = Integer.parseInt( String.valueOf(cardNumber.charAt(0)) ); // All this does is convert a char to an int, but hey that's Java for you

		if (firstCardNum == 4| firstCardNum == 5| firstCardNum == 6) {
			return true;
		} else { 
			return false; }
	}
	
	
	
	public boolean validCard(String cardNumber) {

		
		return validCardCheckFirst(cardNumber);
	}
}