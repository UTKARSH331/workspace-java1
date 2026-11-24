package com.largest;

public class LongetSubarraywithSum {
	//int maxLen = 0;
	public static int longestsubarrayWithSum(int arr[], int k) {
		int sum = 0, maxLen = 0, left = 0;
		int n = arr.length;
		
		for(int right = 0; right <n; right++) {
			sum += arr[right];
		
		System.out.println("sum of all nos. :" + sum);
		
		while(sum > k) {
			sum -= arr[left];
			left++;
		}
		maxLen = Math.max(maxLen, right - left + 1);
		
		}
		return maxLen;
	}
	public static void main(String[] args) {
		  int[] arr = {2, 5, 1, 7, 10}; // Example array
	        int K = 14; // Example value of K

	        // Find and print the length of the longest subarray with sum <= K
	        int result = longestsubarrayWithSum(arr, K);
	        System.out.println("The longest subarray length with sum <= " + K + " is: " + result);
	}
	
	
	

}
