
public class Quadratic {
	//A call to discriminant returns the value of the discriminant given doubles a, b, and c in that order.
	//It accepts 3 doubles and returns a double.
	public static double discriminant(double a, double b, double c) {
		double answer = 0;
		answer = b*b-4*a*c;
		return answer;
	}
	
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
	
	//quadForm uses the coefficients of a quadratic equation in standard form to approximate real roots
	//it accepts 3 integers and returns a string
	public static String quadForm(double a, double b, double c) {
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
	
	public static String quadrDescriber (double a, double b, double c) {
		System.out.println("Description of the graph of:\ny = "+a+" x^2 + "+b+" x + "+c+"\n");
		if (a<0) {
			System.out.println("Opens: Up");
		} else {
			System.out.println("Opens: Down");
		}
		double symmetry = -b/(2*a);
		System.out.println("Axis of Symmetry: "+symmetry);
		System.out.println("Vertex: ("+symmetry+", "+(a*symmetry*symmetry+b*symmetry+c)+")");
		System.out.println("x-intercept(s): "+ quadForm(a,b,c));
	}
}
