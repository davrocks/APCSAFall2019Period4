//Davin Singh
//APCS1 4th Period Ms. Dreyer
//fracCalc takes in an expression (of integers, mixed numbers, or improper fractions) and calculates it

package fracCalc;
import java.util.*;

public class FracCalc {

    public static void main(String[] args) {
    	Scanner userInput = new Scanner(System.in);
        String test = "don't quit";
        while (!test.equals("quit")) {
        	System.out.print("Enter expression:");
            System.out.println(produceAnswer(userInput.nextLine()));
        	System.out.print("Do you want to quit?");
        	test = userInput.nextLine();
        }
        userInput.close();
    }
    
    public static String produceAnswer(String input) { 
    	String[] splitInput = input.split(" ");
    	
    	int[][] operands = new int[(splitInput.length+1)/2][3];
    	for (int i = 0; i < operands.length; i++) {
    		operands[i] = splitFrac(splitInput[i*2]);
    	}
    	
    	toImproperFrac(operands);
    	int[] tempArr = operands[0];
    	int[] outputArr = {0,0,1};
    	
    	for(int i = 0; i < operands.length-1; i++) {
    		if (splitInput[2*i+1].equals("+")) {
    			add(tempArr, operands[i+1], outputArr);
    		}
    		if (splitInput[2*i+1].equals("-")) {
    			subtract(tempArr, operands[i+1], outputArr);
    		}
    		if (splitInput[2*i+1].equals("*")) {
    			multiply(tempArr,operands[i+1],outputArr);
    		}
    		if (splitInput[2*i+1].equals("/")) {
    			divide(tempArr,operands[i+1],outputArr);
    		}
    		tempArr = outputArr;
    	}
    	toMixedNum(outputArr);
    	reduce(outputArr);
        return construct(outputArr);
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
    
    public static void toImproperFrac (int[][] inputArr) {
    	for(int i = 0; i<inputArr.length; i++) {
    		int temp = inputArr[i][0];
    		inputArr[i][1] = inputArr[i][2]*Math.abs(inputArr[i][0]) + inputArr[i][1];
    		if (temp < 0) {
    			inputArr[i][1] *= -1;
    		}
    		inputArr[i][0] = 0;
    	}
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
    	if (inputArr[0] < 0 ) {
    		inputArr[1] *= -1;
    	}
    	inputArr[1] = inputArr[1] % inputArr[2];
    }
    
    public static void reduce (int[] inputArr) {
    	int num1 = Math.abs(inputArr[1]);
    	int num2 = Math.abs(inputArr[2]);
    	int temp = num2;
    	while (num2 != 0) {                //finds greatest common denominator with Euclid's algorithm
    		temp = num2;
    		num2 = num1 % num2;
    		num1 = temp;
    	}
    	inputArr[1] /= num1; 			   //divides out the common denominator from top & bottom
    	inputArr[2] /= num1;
    }
    
    public static String construct (int[] inputArr) {
        String outputStr = "";
        if (inputArr[0] != 0) {
        	outputStr += inputArr[0];
        	if(inputArr[1] != 0) {
            	outputStr += "_" + inputArr[1] + "/" + inputArr[2];
            }
        }else if (inputArr[1] != 0) {
        	outputStr += inputArr[1] + "/" + inputArr[2];
        }else {
        	outputStr += 0;
        }
        return outputStr;
    }
    public static void add (int[] inputArr1, int[] inputArr2, int[] outputArr) {
    	commonDenom(inputArr1, inputArr2);
		outputArr[1] = inputArr1[1] + inputArr2[1];
		outputArr[2] = inputArr1[2];
    }
    public static void subtract (int[] inputArr1, int[] inputArr2, int[] outputArr) {
    	inputArr2[1] *= -1;
    	add(inputArr1,inputArr2,outputArr);
    }
    public static void multiply (int[] inputArr1, int[] inputArr2, int[] outputArr) {
    	outputArr[1] = inputArr1[1]*inputArr2[1];
		outputArr[2] = inputArr1[2]*inputArr2[2];
    }
    public static void divide (int[] inputArr1, int[] inputArr2, int[] outputArr) {
		outputArr[1] = inputArr1[1]*inputArr2[2];
		outputArr[2] = inputArr1[2]*inputArr2[1];
		if (outputArr[2] < 0) {
			outputArr[2] *= -1;
			outputArr[1] *= -1;
		}
    }
}
