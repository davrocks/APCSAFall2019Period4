import java.util.*;
public class ArraysLab3 {

	public static void main(String[] args) {
		int[] arr1 = {5,3,2};
		int[] arr2 = {3,3,3};
		System.out.println(Arrays.toString(sum(arr1,arr2)));
		int[] arr3 = {2,3,5};
		System.out.println(Arrays.toString(remove(arr3,1)));
		int[] arr4 = {2,1,3,4,4};
		System.out.println(sumEven(arr4));
		int[] arr5 = {2,1,3,4,4};
		rotateRight(arr5);
		System.out.println(Arrays.toString(arr5));

	}
//	1) Write a method sum that accepts two arrays of integers arr1 and arr2 and returns an array of 
//	integers in which every element is the sum of the elements at that index for the arrays arr1 
//	and arr2. You can assume arrays arr1 and arr2 have at least one element each and are the same length.

	public static int[] sum(int[] arr1, int[] arr2) {
		int[] outputArray = new int[arr1.length];
		for(int i = 0; i < arr1.length; i++) {
			outputArray[i] = arr1[i] + arr2[i];
		}
		return outputArray;
			
	}

//	2) Write a method append that accepts an array of integers arr of length n and an integer num,
//	and returns an array of integers of length n+1 that consists of the elements of arr with
//	num appended to the end.  You can assume array arr has at least one element.

	public static int[] append(int[] arr, int num) {
		int[] outputArray = new int[arr.length+1];
		for (int i = 0; i < arr.length; i++) {
			outputArray[i] = arr[i];
		}
		outputArray[outputArray.length-1] = num;
		return outputArray;
	}

//	3) Write a method remove that accepts an array of integers arr and an integer
//	idx and returns an array of integers consisting of all of the elements of arr
//	except for the element at index idx (thus, the returned array has a length of 
//	arr.length � 1).  You can assume arr has at least two elements.

	public static int[] remove(int[] arr, int idx) {
		int[] outputArray = new int[arr.length-1];
		for(int i = 0; i < arr.length; i++) {
			if (i < idx) {
				outputArray[i] = arr[i];
			} else if (i>idx){
				outputArray[i-1] = arr[i];
			}
		}
		return outputArray;
	}

//	4) Write a method sumEven that accepts an array of integers arr and returns 
//	an integer containing the sum of the elements at the even indices of arr.  
//	(That means elements at indices 0,2,4,6,8.)  You can assume arr has at least one element.

	public static int sumEven(int[] arr) {
		int sum = 0;
		for(int i = 0; i < (arr.length+1)/2; i++) {
			sum += arr[i*2];
		}
		return sum;
	}


//	5) Write a method rotateRight that accepts an array of integers arr and does 
//	not return a value.  The rotateRight method moves each element of arr one
//	index to the right (element 0 goes to element 1, element 1 goes to element
//	2, �, element n-1 goes to element 0).  You can assume arr has at least one element.

	public static void rotateRight(int[] arr) {
		for(int i = arr.length-2; i > 0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = arr[arr.length-1];
	}

//	6) Write a method main that will 
//
//	Contain
//	integer arrays a1, a2, sumArr, appendArr, removeArr
//	int variables appendNum, removeIdx, sumOfEvens
//	Carry out the following actions
//	Declare array a1 containing the values (5, 10, 15, 20, 25, 30, 35, 40) and array a2 containing the values (7, 14, 21, 28, 35, 42, 49, 56)
//	Form sumArr by calling the sum method with a1 and a2 as inputs
//	Declare int appendNum and set it to 200.
//	Form appendArr by calling the append method with a1 and appendNum as inputs
//	Declare int removeIdx and set it to 5.
//	Form removeArr by calling remove with a2 and removeIdx
//	Form sumOfEvens by calling sumEven with appendArr as the input
//	Call rotateRight with a1 as the input
//	On their own lines print out (use Arrays.toString to transform arrays into a printable strings) :
//	sumArr
//	appendArr
//	removeArr
//	sumOfEvens (an int you don�t need Arrays.toString)
//	a1
	 


	
}
