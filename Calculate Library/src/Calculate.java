/* Davin Singh
 * August 29, 2019
 * AP CSA 4th period
 * group of methods that perform math calculations (a library)
 */
public class Calculate {
	//A call to square returns the square of the value passed.
	//It accepts and returns an integer.
	public static int square(int number) {
		int answer = 0;
		answer = number*number;
		return answer;
	}
	
	//A call to cube returns the cube of the value passed.
	//It accepts and returns an integer.
	public static int cube(int number) {
		int answer = 0;
		answer = number*number*number;
		return answer;		
	}

	
	//A call to average returns the average of the two values passed.
	//This average method accepts 2 doubles and returns a double.
	public static double average(double number1, double number2) {
		double answer = 0;
		answer = (number1+number2)/2;
		return answer;
				
	}
	
	
	//A call to average returns the average of the three values passed.
	//This average method accepts 3 doubles and returns a double.
	public static double average(double number1, double number2, double number3) {
		double answer = 0;
		answer = (number1+number2+number3)/3;
		return answer;			
	}
	
	//A call to toDegrees converts a passed angle from radians to degrees.
	//It accepts and returns a double.
	public static double toDegrees(double angle) {
		double answer = 0;
		answer = angle*180/3.14159;
		return answer;		
	}
	
	//A call to toRadians converts a passed angle from degrees to radians.
	//It accepts and returns a double.
	public static double toRadians(double angle) {
		double answer = 0;
		answer = angle*3.14159/180;
		return answer;		
	}
	
	//A call to discriminant returns the value of the discriminant given doubles a, b, and c in that order.
	//It accepts 3 doubles and returns a double.
	public static double discriminant(double number1, double number2, double number3) {
		double answer = 0;
		answer = number2*number2-4*number1*number3;
		return answer;
	}

	//A call to toImproperFrac converts a mixed number (with the pieces provided as whole number, numerator, and denominator) to an improper fraction.
	//It accepts three integers and returns a String.
	public static String toImproperFrac(int number1, int number2, int number3) {
		int numerator = number1*number3+number2;
		int denominator = number3;
		String answer = ""+numerator+"/"+denominator;
		return answer;		
	}
	
	//A call to toMixedNum converts input in the form numerator, denominator (such as 7, 2)to a string that is a mixed number in the form 3_1/2
	//It accepts two integers and outputs a String
	public static String toMixedNum(int number1, int number2) {
		int wholeNumber = number1 / number2;
		int numerator = number1 % number2;
		int denominator = number2;
		String answer = "" + wholeNumber + "_" + numerator + "/" + denominator;
		return answer;		
	}
	
	//A call to foil converts a binomial multiplication (ax + b)(cx + d) (inputted in the order of coefficients, then a string for the variable letter) into a quadratic equation (ax^2 + bx + c).
	//It accepts four integers and a String and outputs a String.
	public static String foil(int number1, int number2, int number3, int number4, String variableLetter) {
		int coefficient1 = number1 * number3;
		int coefficient2 = number1 * number4 + number2 * number3;
		int coefficient3 = number2 * number4;
		String answer = "" + coefficient1 + variableLetter + "^2 + " + coefficient2 + variableLetter + " + " + coefficient3;
		return answer;		
	}
	
	//A call to isDivisibleBy determines whether or not one integer is divisible by another
	//It accepts two integers and returns a boolean.
	public static boolean isDivisibleBy(int number1, int number2) {
			if (number1%number2 == 0) {
				return true;
			} else {
				return false;
			}
	}
	
	//A call to absValue returns the absolute value of a number passed.
	//It accepts and returns a double.
	public static double absValue(double number1) {
		if (number1 >= 0) {
			return number1;
		} else {
			return -number1;
		}
	}
	
	//A call to max returns the larger of the two values
	//It accepts two doubles and returns a double.
	public static double max(double number1, double number2) {
		if (number1 >= number2) {
			return number1;
		} else {
			return number2;
		}
	}
	
	//A call to max returns the larger of the three values
	//It accepts three doubles and returns a double.
	public static double max(double number1, double number2, double number3) {
		double answer = max(number1, max(number2, number3));
		return answer;
	}
	
	//A call to min returns the smaller of the two values
	//It accepts two doubles and returns a double.
	public static double min(double number1, double number2) {
		if (number1 <= number2) {
			return number1;
		} else {
			return number2;
		}
	}
	
	//A call to round2 rounds a double to 2 decimal places
	//It accepts a double and returns a double
	public static double round2(double number1) {
		number1 = number1 * 100;
		if (number1>=0) {
			number1 = number1 + 0.5;
		} else {
			number1 = number1 - 0.5;
		}
		number1 = (int) number1;
		number1 = ((double) number1)/100;
		return number1;
	}

	//A call to exponent raises the value to a positive integer power
	//It accepts a double and an integer and returns a double.
	public static double exponent(double base, int power) {
		double answer = 1;
		for (int i=0; i<power; i++) {
			answer = answer*base;
		}
		return answer;
	}
	
	//A call to factorial returns the factorial of the value passed
	//It accepts and returns an integer
	public static int factorial(int number1) {
		int answer = 1;
		for (int i = 2; i<=number1; i++) {
			answer = answer*i;
		}
		return answer;
	}
	
	//A call to isPrime detemines whether or not an integer is prime.
	//It accepts an integer and returns a boolean
	public static int isPrime(int number1) {
		for(int i = number1; )
	}
}

