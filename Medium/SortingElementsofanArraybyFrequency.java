
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner scanner  = new Scanner(System.in);
	    int testCases = scanner.nextInt();
    
	    for(int i = 1; i <= testCases; i++){
	        int size = scanner.nextInt();
	        int[] arr = new int[size];
	        
	        for(int j = 0; j < size; j++)
	        arr[j] = scanner.nextInt();
	        
	        solution(arr);
	        
	        for(int num : arr)
	        System.out.print(num + " ");
	        
	        System.out.println();
	    }
	}
	
// 	Brute Force Approach : O(n * max) time and O(max) space
	/*
  static void solution(int[] arr){
	    int max = 0;
	    int index = 0;
     // Finds maximum value in arr, (max) → to size frequency array
	    for(int num : arr){
	        if(num > max)
	        max = num;
	    }
		int[] temp = new int[max + 1];
		// Builds frequency array temp[num] for each number
		for(int num : arr)
		    temp[num] += 1;
		  
	    while(index < arr.length){
	        int curr = 0;
         // Scan temp[] to find element with highest frequency
	        for(int j = 0; j < temp.length; j++){
	            if(temp[j] > curr){
	                curr = temp[j];
	                max = j;
	            }
	        }
	        // Place all its occurrences back into arr
	        while(temp[max] > 0){
	            arr[index++] = max;
	            temp[max] -=1;
	        }
	    }
    */
  // Optimized Approach : O(nlogn) time and O(n) space
  // Using HashMap and Sorting
  static void solution(int[] arr){
	    HashMap<Integer, Integer> freq = new HashMap<>();
    
	   // Count Frequency
	    for(int num : arr){
        // if num is not present then freq.get() will return null and null + 1 gives us Null Pointer Exception
	     // that's why we use getOrDefault() bcz if num is not present it will return 0 and we increment the count by 1
	        freq.put(num, freq.getOrDefault(num, 0) + 1);
	    }
    
	   // Convert to list and sort
	    List<Integer> list = new ArrayList<>();
	    for(int num : arr)
	    list.add(num);
    
	    // Sort by frequency (desc), then value (asc)
	    Collections.sort(list, (a, b) -> {
	        int freqA = freq.get(a), freqB = freq.get(b);
	        if(freqA != freqB) return freqB - freqA; // higher frequency first
	        return a - b; // smaller value first in case of tie
	    });
	    
	    // Copy back to array
	    int index = 0;
	    for(int num : list)
	    arr[index++] = num;
	}
	}
}
