package com.constant;

public class Constant1 {
	
	public static void slidingWindow (int arr[], int k) {
		int n = arr.length, sum =0;
		for(int i=0; i<n; i++) {
			sum += arr[i];
		}
		System.out.println("sum of window *1 : " + sum);
		
		for(int i = k; i<n; i++) {
			sum = sum - arr[i-k] + arr[i];
			System.out.println( " sum of the window &" + (i-k+2) + "  : " + sum);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1,3,6,4,2,7,5};
		int k =2;
		slidingWindow(arr, k);
	}

}
