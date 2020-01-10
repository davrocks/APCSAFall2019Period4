package fracCalc;
import java.util.*;

public class Fraction {
	private int whole = 0;
	private int numerator = 0;
	private int denominator = 1;
	
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
}
