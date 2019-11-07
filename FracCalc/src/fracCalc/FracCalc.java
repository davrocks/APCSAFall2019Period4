//Davin Singh
//APCS1 4th Period Ms. Dreyer
//fracCalc takes in an expression (of integers, mixed numbers, or improper fractions) and calculates it

package fracCalc;
import java.util.*;

public class FracCalc {

    public static void main(String[] args) 
    {
        Scanner userInput = new Scanner(System.in);
        String test = "don't quit";
        while (!test.equals("quit")) {
        	System.out.print("Enter expression:");
            System.out.println(produceAnswer(userInput.nextLine()));
        	System.out.print("Do you want to quit?");
        	test = userInput.nextLine();
        }
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
    	String[] splitInput = input.split(" ");
    	int[] operand1 = splitFrac(splitInput[0]);
    	int[] operand2 = splitFrac(splitInput[2]);
        return Arrays.toString(operand1);
    }

    public static int[] splitFrac (String fracInput) {
    	int[] output = {0,0,1};
    	String[] inputArray = fracInput.split("_");
    	if (inputArray[0].indexOf("/") != -1) {
    		inputArray = inputArray[0].split("/");
    		output[1] = Integer.parseInt(inputArray[0]);
    		output[2] = Integer.parseInt(inputArray[1]);
    		return output;
    	}
    	output[0] = Integer.parseInt(inputArray[0]);
		if (inputArray.length == 2) {
       		inputArray = inputArray[1].split("/");
    		output[1] = Integer.parseInt(inputArray[0]);
    		output[2] = Integer.parseInt(inputArray[1]);
    	}
    	return output;
    }
    public static int[] splitFrac (String fracInput) {
    	int[] output = {0,0,1};
    	if (fracInput.indexOf("/") != -1) {
    		String[] inputArray = fracInput.split("/");
    		output[2] = Integer.parseInt(inputArray[1]);
    		if (inputArray[0].indexOf("_") != -1) {
        		String[] underscore = inputArray[0].split("_");
        		output[0] = Integer.parseInt(underscore[0]);
        		output[1] = Integer.parseInt(underscore[1]);
        	} else {
        		output[1] = Integer.parseInt(inputArray[0]);
        	}
    	} else {
    		output[0] = Integer.parseInt(fracInput);
    	}
    	return output;
    }
}
