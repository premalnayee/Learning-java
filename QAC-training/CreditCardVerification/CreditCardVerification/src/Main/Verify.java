package Main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Verify {
	
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
	
	String cardString;
	
	public void validCard(String cardString) {
		this.cardString = cardString;
	}
	
	boolean validCardCheckFirst(String cardString) {
		int firstCardNum = Integer.parseInt( String.valueOf(cardString.charAt(0)) ); // All this does is convert a char to an int, but hey that's Java for you

		if (firstCardNum == 4| firstCardNum == 5| firstCardNum == 6) {
			return true;
		} else { 
			return false; }
	}
	
	boolean checkLength(String cardString) {
		return cardString.matches("[0-9]{16}");
	}
	
	boolean validCharacters(String cardString) {
		return cardString.matches("[(\\d)\\1{3}]");
	}
	
	boolean checkNotRepeated(String cardString) {
		return false;
	}

}
