//Davin Singh
//APCS 1 4th Period
//Uses the Split method to find the filling of sandwiches
import java.util.*;
public class Split {

 

 public static void main(String[] args) {

// Your task Part 0

//String.split();

//It's a method that acts on a string, <StringName>.split(<sp>);

//Where sp is the string where the string splits

//And it returns an array of strings

// Example: "I like apples!".split(" ");

// it will split at spaces and return an array of ["I","like","apples!"]

// Example 2: "I really like really red apples!".split("really")

// it will split at the word "really" and return an array of ["I "," like "," red apples!"]

//play around with String.split!

//What happens if you "I reallyreally likeapples".split("really") ?
  	System.out.println(Arrays.toString("I like apples!".split(" ")));
  	System.out.println(Arrays.toString("I really like really red apples!".split("really")));
  	System.out.println(Arrays.toString("I really like really red apples!".split(" really ")));
  	System.out.println(Arrays.toString("really I really like really red apples!".split("really")));
    System.out.println(part1("breadmayotomatobreadbread"));
    System.out.println(part1("mayobreadham"));
    System.out.println(part1("mayo"));
    System.out.println(part1("breadbread"));
    System.out.println(part1("breadtomatobread"));
    System.out.println(part1("breadmayotomatobreadbreadtomato"));
    System.out.println(part1("breadbreaid"));
	 
    System.out.println(part2("apples pineapples bread lettuce tomato bacon mayo ham bread cheese"));
 }
//Your task Part 1:

/*Write a method that take in a string like

* "applespineapplesbreadlettucetomatobaconmayohambreadcheese"

* describing a sandwich.

* Use String.split to split up the sandwich by the word "bread" and return what's in the middle of

* the sandwich and ignores what's on the outside

* What if it's a fancy sandwich with multiple pieces of bread?

*/
public static String part1(String sandwich) {
	String[] splitArray = sandwich.split("bread");	//splits sandwich at bread
	String outputString = "";						//initializes output to be a blank string
	int counter = 0;								//counter to be used for array index
	while (sandwich.indexOf("bread") != -1 && counter + 1 < splitArray.length) {  //tests if a bread exists in sandwich & if the counter for index is less than length 
		sandwich = sandwich.substring(sandwich.indexOf("bread")+5);	//makes sandwich equal a substring for everything past the first bread
		if(sandwich.indexOf("bread") != -1) {	//tests if a bread exists (in this new substring)
			counter++;							//moves the counter up one, so the index is one more
			outputString+= splitArray[counter]; //use counter as the array index, and add that element to output
		}
	}
	if (counter!=0) {  //if the while loop triggered, output the outputString
		return outputString;
	}
	return "Oops, looks like your input isn't a sandwich!!!"; //if while loop did not trigger, it is not a sandwich.
}
 
 
//Your task pt 2:

/*Write a method that take in a string like

* "apples pineapples bread lettuce tomato bacon mayo ham bread cheese"

* describing a sandwich

* use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of

* the sandwich and ignores what's on the outside.

* Again, what if it's a fancy sandwich with multiple pieces of bread?

*/
public static String part2(String sandwich) {
	String output = "";
	String[] splitArray2 = sandwich.split(" ");
	for(int i = 1; i<splitArray2.length; i++) {
		output+= splitArray2[i];
	}
	return part1(output);
}

}




