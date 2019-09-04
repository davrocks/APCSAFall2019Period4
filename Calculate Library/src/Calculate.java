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
	public static double toDegrees(double number) {
		double answer = 0;
		answer = number*180/3.14159;
		return answer;		
	}
	
	//A call to toRadians converts a passed angle from degrees to radians.
	//It accepts and returns a double.
	public static double toRadians(double number) {
		double answer = 0;
		answer = number*3.14159/180;
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
	//It accepts three integers and returns a string.
	public static int toImproperFrac(int number1, int number2, int number3) {
		int answer = 0;
		answer = number1*number2*number3;
		return answer;		
	}
	
	//A call to cube returns the cube of the value passed.
	//It accepts and returns an integer.
	public static int cube(int number) {
		int answer = 0;
		answer = number*number*number;
		return answer;		
	}
	
	//A call to cube returns the cube of the value passed.
	//It accepts and returns an integer.
	public static int cube(int number) {
		int answer = 0;
		answer = number*number*number;
		return answer;		
	}
	
	//A call to cube returns the cube of the value passed.
	//It accepts and returns an integer.
	public static int cube(int number) {
		int answer = 0;
		answer = number*number*number;
		return answer;		
	}
	
	//A call to cube returns the cube of the value passed.
	//It accepts and returns an integer.
	public static int cube(int number) {
		int answer = 0;
		answer = number*number*number;
		return answer;		
	}
	
}

