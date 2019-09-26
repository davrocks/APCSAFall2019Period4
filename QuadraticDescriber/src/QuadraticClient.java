import java.util.*;

public class QuadraticClient {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Quadratic Describer\nProvide values for coefficients a, b, and c");
		String test;
		do {
			System.out.println();
			System.out.print("a: ");
			double a = input.nextDouble();
			System.out.print("b: ");
			double b = input.nextDouble();
			System.out.print("c: ");
			double c = input.nextDouble();
			System.out.println();
			String output = Quadratic.quadrDescriber(a, b, c);
			System.out.println(output);
			System.out.println("\nDo you want to keep going? (Type \"quit\" to end)");
			test = input.nextLine();
		} while (!test.toUpperCase().equals("QUIT"));
	}

}
