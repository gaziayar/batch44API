package _07_ForLoop;

import java.util.Arrays;

public class Q06array {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an integer array as input and prints the minimum
		 * and the maximum numbers from given array
		 * 
		 * Input : {3,2,5,4,1,6}
		 * 
		 * Output :
		 * 
		 * min: 1
		 * 
		 * max: 6
		 */
		int arr[] = { 3, 2, 5, 4, 1, 6 };

		Arrays.sort(arr);

		//System.out.println(Arrays.toString(arr));

		maxmin(arr);

	}

	private static void maxmin(int[] arr) {

		int max = arr[arr.length -1];
		int min = arr[0];

		System.out.println("min:" + min);

		System.out.println("max:" + max);

	}

}
