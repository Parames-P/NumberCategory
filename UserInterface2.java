package Day5;
import java.util.Scanner;

public class UserInterface2 {
		
	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the first number:");
	        int number1 = scanner.nextInt();
	        System.out.println("Enter the second number:");
	        int number2 = scanner.nextInt();

	        // Check if numbers are amicable
	        NumberCategory amicableCheck = NumberCategoryUtility.checkAmicable();
	        boolean areAmicable = amicableCheck.checkNumberCategory(number1, number2);

	        // Check if product produces a palindrome
	        NumberCategory palindromeCheck = NumberCategoryUtility.checkPalindrome();
	        boolean producesPalindrome = palindromeCheck.checkNumberCategory(number1, number2);

	        // Display results
	        if (areAmicable) {
	            System.out.println(number1 + " and " + number2 + " are amicable numbers");
	        } else {
	            System.out.println(number1 + " and " + number2 + " are not amicable numbers");
	        }

	        if (producesPalindrome) {
	            System.out.println("Their Product " + (number1 * number2) + " does produce a Palindrome");
	        } else {
	            System.out.println("Their Product " + (number1 * number2) + " does not produce a Palindrome");
	        }
	    }
	}


			


