package Day5;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;


	// Utility class to check amicability and palindrome
	class NumberCategoryUtility {
	    // Method to check if numbers are amicable
	    public static NumberCategory checkAmicable() {
	        return (number1, number2) -> {
	            int sum1 = IntStream.rangeClosed(1, number1 / 2).filter(i -> number1 % i == 0).sum();
	            int sum2 = IntStream.rangeClosed(1, number2 / 2).filter(i -> number2 % i == 0).sum();
	            return (sum1 == number2) && (sum2 == number1);
	        };
	    }

	    // Method to check if product produces a palindrome
	    public static NumberCategory checkPalindrome() {
	        return (number1, number2) -> {
	            int product = number1 * number2;
	            String productString = String.valueOf(product);
	            String reversedProductString = new StringBuilder(productString).reverse().toString();
	            return productString.equals(reversedProductString);
	        };
	    }
	}






	
