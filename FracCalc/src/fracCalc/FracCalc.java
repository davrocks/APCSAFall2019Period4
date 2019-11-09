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
    	int[] outputArr = {0,0,1};
    	toImproperFrac(operand1);
    	toImproperFrac(operand2);
    	if (splitInput[1].equals("+") || splitInput[1].equals("-")) {
    		commonDenom(operand1, operand2);
        	if (splitInput[1].equals("+")) {
        		outputArr[1] = operand1[1] + operand2[1];
            	outputArr[2] = operand1[2];
        	} else {
        		outputArr[1] = operand1[1] - operand2[1];
            	outputArr[2] = operand1[2];
        	}
    	}
    	if (splitInput[1].equals("*")) {
    		outputArr[1] = operand1[1]*operand2[1];
        	outputArr[2] = operand1[2]*operand2[2];
    	}
    	if (splitInput[1].equals("/")) {
    		outputArr[1] = operand1[1]*operand2[2];
        	outputArr[2] = operand1[2]*operand2[1];
    	}
    	toMixedNum(outputArr);
    	reduce(outputArr);
        return Arrays.toString(outputArr);
        
    }

    public static int[] splitFrac (String fracInput) {
    	int[] output = {0,0,1};                       //outputs int array of whole #, numerator, denominator
    	String[] inputArr = fracInput.split("_");     //splits at underscore
    	if (inputArr[0].indexOf("/") != -1) {         //tests if the input is just a fraction w/o a whole number (index 0 has "/")
    		inputArr = inputArr[0].split("/");
    		output[1] = Integer.parseInt(inputArr[0]);
    		output[2] = Integer.parseInt(inputArr[1]);
    		return output;                            //if the input is just fraction w/o whole number, return it
    	}
    	output[0] = Integer.parseInt(inputArr[0]);    //since it has a whole number, copy the whole number to the output array
		if (inputArr.length == 2) {                   //if there is a fraction after the whole number, copy it to the output array.
       		inputArr = inputArr[1].split("/");
    		output[1] = Integer.parseInt(inputArr[0]);
    		output[2] = Integer.parseInt(inputArr[1]);
    	}
    	return output;
    }
    public static void toImproperFrac (int[] inputArr) {
    	inputArr[1] = inputArr[2]*inputArr[0] + inputArr[1];
    	inputArr[0] = 0;
    }
    public static void commonDenom (int[] inputArr1, int[] inputArr2) {
    	int temp = inputArr1[2];
    	inputArr1[1] *= inputArr2[2];
    	inputArr1[2] *= inputArr2[2];
    	inputArr2[1] *= temp;
    	inputArr2[2] *= temp;
    }
    public static void toMixedNum (int[] inputArr) {
    	inputArr[0] = inputArr[1]/inputArr[2];
    	inputArr[1] = inputArr[1] % inputArr[2];
    }
    public static void reduce (int[] inputArr) {
    	for (int i = )
    }
    
}
