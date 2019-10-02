import java.util.*;
public class ProcessingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many numbers? ");
		int times = input.nextInt();
		System.out.print("#1: ");
		int min = input.nextInt();
		int max = min;
		int evenMax = min;
		int evenSum = 0;
		boolean found = false;
		if (max%2==0) {
			evenSum = max;
			found = true;
		}
		int num;
		for(int i = 2; i<=times; i++) {
			System.out.print("#" + i + ": ");
			num = input.nextInt();
			if (num> max) {
				max = num;
			}
			if (num<min) {
				min = num;
			}
			if (num%2 ==0) {
				evenSum += num;
				if (found == false) {
					evenMax = num;
				}
				found = true;
				if (num > evenMax) {
					evenMax = num;
				}
			}
		}
		System.out.println("Minimum: "+min+"\nMaxmimum: "+max);
		if (found == true) {
			System.out.println("Even Sum: "+evenSum+"\nEven Max: "+evenMax);
		} else {
			System.out.println("No even numbers");
		}
		input.close();
	}

}
