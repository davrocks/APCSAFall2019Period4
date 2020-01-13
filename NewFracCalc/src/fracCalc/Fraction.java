//Davin Singh

//APCS1 4th Period Ms. Dreyer

package fracCalc;
import java.util.*;

public class Fraction {
	private int whole = 0;
	private int numerator = 0;
	private int denominator = 1;
	
	public Fraction (int w, int n, int d) {
		whole = w;
		numerator = n;
		denominator = d;
	}
	
	public Fraction (String fracInput) {
    	String[] inputArr = fracInput.split("_");     //splits at underscore
    	if (inputArr[0].indexOf("/") != -1) {         //tests if the input is just a fraction w/o a whole number (index 0 has "/")
    		inputArr = inputArr[0].split("/");
    		numerator = Integer.parseInt(inputArr[0]);
    		denominator = Integer.parseInt(inputArr[1]);
    	} else {
    		whole = Integer.parseInt(inputArr[0]);    //since it has a whole number, copy the whole number to the output array
    		if (inputArr.length == 2) {                   //if there is a fraction after the whole number, copy it to the output array.
     	 		inputArr = inputArr[1].split("/");
     	 		numerator = Integer.parseInt(inputArr[0]);
     	 		denominator = Integer.parseInt(inputArr[1]);
    		}
    	}
    }
	
    public void commonDenom (int[] inputArr1, int[] inputArr2) {
    	int temp = inputArr1[2];
    	inputArr1[1] *= inputArr2[2];
    	inputArr1[2] *= inputArr2[2];
    	inputArr2[1] *= temp;
    	inputArr2[2] *= temp;
    }
	
	public void add(Fraction op2) {
    	commonDenom(inputArr1, inputArr2);
		outputArr[1] = inputArr1[1] + inputArr2[1];
		outputArr[2] = inputArr1[2];
	}
	public void subtract(Fraction op2) {
	}
	public void multiply(Fraction op2) {
	}
	public void divide(Fraction op2) {
	}
	public void reduce() {
	}
    public void toImproperFrac() {
    	int temp = whole;
    	numerator = denominator*Math.abs(whole) + numerator;
   		if (temp < 0) {
   			numerator *= -1;
   		}
   		whole = 0;
    }
}
