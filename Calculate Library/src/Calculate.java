/* Davin Singh
 * August 29, 2019
 * AP CSA 4th period
 * group of methods that perform math calculations (a library)
 */
public class Calculate {
	
	
	
	
	// PART 1, METHODS, HEADERS, AND BASIC MATH
	
	
	
	
	//A call to square returns the square of the value passed.
	//It accepts and returns an integer.
	public static int square(int base) {
		int answer = 0;
		answer = base*base;
		return answer;
	}
	
	//A call to cube returns the cube of the value passed.
	//It accepts and returns an integer.
	public static int cube(int base) {
		int answer = 0;
		answer = base*base*base;
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
	public static double discriminant(double a, double b, double c) {
		double answer = 0;
		answer = b*b-4*a*c;
		return answer;
	}

	//A call to toImproperFrac converts a mixed number (with the pieces provided as whole number, numerator, and denominator) to an improper fraction.
	//It accepts three integers and returns a String.
	public static String toImproperFrac(int wholeNumber, int inputNumerator, int inputDenominator) {
		if (wholeNumber < 0 || inputNumerator < 0 || inputDenominator < 0) {
			throw new IllegalArgumentException("no negative inputs allowed, since part 1 is not supposed to use if statements");
		}
		if (inputDenominator == 0) {
			throw new IllegalArgumentException("denominators of zero are undefined");
		}
		int newNumerator = wholeNumber*inputDenominator+inputNumerator;
		int newDenominator = inputDenominator;
		String answer = ""+newNumerator+"/"+newDenominator;
		return answer;		
	}
	
	//A call to toMixedNum converts input in the form numerator, denominator (such as 7, 2)to a string that is a mixed number in the form 3_1/2
	//It accepts two integers and outputs a String
	public static String toMixedNum(int inputNumerator, int inputDenominator) {
		if (inputNumerator < 0 || inputDenominator < 0) {
			throw new IllegalArgumentException("no negative inputs allowed, since part 1 is not supposed to use if statements");
		}
		if (inputDenominator == 0) {
			throw new IllegalArgumentException("denominators of zero are undefined");
		}
		int wholeNumber = inputNumerator / inputDenominator;
		int newNumerator = inputNumerator % inputDenominator;
		int newDenominator = inputDenominator;
		String answer = "" + wholeNumber + "_" + newNumerator + "/" + newDenominator;
		return answer;		
	}
	
	//A call to foil converts a binomial multiplication (ax + b)(cx + d) (inputted in the order of coefficients, then a string for the variable letter) into a quadratic equation (ax^2 + bx + c).
	//It accepts four integers and a String and outputs a String.
	public static String foil(int inputCoefficient1, int inputCoefficient2, int inputCoefficient3, int inputCoefficient4, String variableLetter) {
		int outputCoefficient1 = inputCoefficient1 * inputCoefficient3;
		int outputCoefficient2 = inputCoefficient1 * inputCoefficient4 + inputCoefficient2 * inputCoefficient3;
		int outputCoefficient3 = inputCoefficient2 * inputCoefficient4;
		String answer = "" + outputCoefficient1 + variableLetter + "^2 + " + outputCoefficient2 + variableLetter + " + " + outputCoefficient3;
		return answer;		
	}
	
	
	
	
	//PART 2: METHODS WITH CONDITIONALS
	
	
	
	
	//A call to isDivisibleBy determines whether or not one integer is divisible by another
	//It accepts two integers and returns a boolean.
	public static boolean isDivisibleBy(int largerNumber, int smallerNumber) {
		if (smallerNumber == 0) {
			throw new IllegalArgumentException("dividing by zero is undefined");
		}
		if (largerNumber%smallerNumber == 0) {
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
		if (number1>=0) {                    //subtracts from negative numbers, adds to positive numbers
			number1 = number1 + 0.5;
		} else {
			number1 = number1 - 0.5;
		}
		number1 = (int) number1;             //truncate
		number1 = ((double) number1)/100;    //undo the first operation (multiply by 100)
		return number1;
	}

	
	
	
	//PART 3: METHODS THAT USE LOOPS AND CALLS TO OTHER METHODS
	
	
	
	
	//A call to exponent raises the value to a positive integer power
	//It accepts a double and an integer and returns a double.
	public static double exponent(double base, int power) {
		if (power < 0) {
			throw new IllegalArgumentException("no negative powers allowed");
		}
		double answer = 1;                      //initialize to 1
		for (int i=0; i<power; i++) {           //increase the number of multiplications until it reaches the proper number
			answer = answer*base;                       //multiply another time
		}
		return answer;
	}
	
	//A call to factorial returns the factorial of the value passed
	//It accepts and returns an integer
	public static int factorial(int number1) {
		if (number1 < 0) {
			throw new IllegalArgumentException("no negative inputs allowed");
		}
		int answer = 1;                                  //initialize to 1
		for (int i = 2; i<=number1; i++) {               //keep multiplying by the next integer until the integer reaches the input    
			answer = answer*i;
		}
		return answer;
	}
	
	//A call to isPrime determines whether or not an integer is prime.
	//It accepts an integer and returns a boolean
	public static boolean isPrime(int number1) {
		boolean value = false;
		if (number1 == 2 || number1 == -2) {               //2 and -2 are always prime
			return true;
		}
		for(int i = 2; i < absValue(number1); i++) {       //check for any divisors between 1 and the input
			if (isDivisibleBy(number1,i) == true) {
				return false;
			} else {
				value = true;
			}
		}	
		return value;
	}
	
	//A call to gcf finds the greatest common factor of two positive integers.
	//It accepts two positive integers and returns an integer.
	public static int gcf(int number1, int number2) {
		if (number1 == 0 || number2 == 0) {
			throw new IllegalArgumentException("no inputs of zero allowed");
		}
		int answer = 1;
		for (int i = 1; i <= absValue(min(number1, number2)); i++) {                 //find divisors, and keep running the loop until the highest divisor has been found
			if (isDivisibleBy(number1, i) == true && isDivisibleBy(number2, i) == true) {
				answer = i;
			}
		}
		return answer;
	}
	
	//A call to sqrt returns an approximation of the square root of the value (to 2 decimal places)
	//This method accepts and returns a double
	public static double sqrt(double radicand) {
		if (radicand<0) {
			throw new IllegalArgumentException("no negative inputs allowed in sqrt");
		}
		double guess = 1;
		while (absValue(radicand-guess*guess) > 0) {                  //repeat newton's algorithm until the difference is 0
			guess = 0.5*(radicand/guess + guess);
		}
		guess = round2(guess);
		return guess;
	}

	
	
	
	//PART 4: THROWING EXCEPTIONS (AND QUADFORM)
	
	
	
	
	//quadForm uses the coefficients of a quadratic equation in standard form to approximate real roots
	//it accepts 3 integers and returns a string
	public static String quadForm(int a, int b, int c) {
		double root1;
		double root2;
		if (discriminant(a, b, c) < 0) {
			return "no real roots";
		}
		if (discriminant(a,b,c) > 0) {
			root1 = (-b + sqrt(discriminant(a,b,c)) ) / (2*a);
			root2 = (-b - sqrt(discriminant(a,b,c)) ) / (2*a);
			return "" + root1 + " and " + root2;
		}
		if (discriminant(a,b,c) == 0) {
			root1 = (-b + sqrt(discriminant(a,b,c)) ) / (2*a);
			return "" + root1;
		}
		return "placeholder";
	}
}

