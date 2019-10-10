import java.util.*;

public class Hourglass {
	
	public static void space(int times) {
		for(int space = 1; space <= times; space++) {
			System.out.print(" ");
		}
	}
	
	public static void enter() {
		System.out.println();
	}
	
	public static void line(int times) {
		for(int space = 1; space <= times; space++) {
			System.out.print("|");
		}
	}
	
	public static void quote(int repeats) {
		for (int quote = 1; quote <= repeats; quote++) {
			System.out.print("\"");
		}
	}
	
	public static void backslash() {
		System.out.print("\\");
	}
	
	public static void forwardslash() {
		System.out.print("/");
	}
	
	public static void colon(int size, int line) {
		for(int colon = size - 2*line; colon >= 1; colon--) {
			System.out.print(":");
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What size do you want your hourglass?");
		int size = input.nextInt();
		line(1);
		quote(size);
		line(1);
		enter();
		for (int line = 1; line <= size/2 -1; line++) {
			space(line);
			backslash();
			colon(size, line);
			forwardslash();
			enter();
		}
		space(size/2);
		line(size - 2*(size/2-1)); //the number of lines is equal to the number of colons on the previous row
		enter();
		for (int line = size/2 - 1; line >=1; line--) {
			space(line);
			forwardslash();
			colon(size, line);
			backslash();
			enter();
		}
		line(1);
		quote(size);
		line(1);
		input.close();

	}

}
