class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    // Brute Force Approach --O(d*arr.length) or O(n^2) 
    // In each iteration, shift the elements by one position to the left in a circular fashion (the first element becomes the last). 
    // Perform this operation d times to rotate the elements to the left by d positions.
    /*
    static void rotateArr(int arr[], int d) {
        while(d > 0){
            // picking the first number
            int num  = arr[0];
            
            // shifting all the elements of array in left direction by one position
            for(int i = 1; i < arr.length; i++)
                arr[i - 1] = arr[i];
                
            // placing the first element at last position 
            arr[arr.length - 1] = num;
            d --;
        }
    }
    */
    // Using temporary array --O(n) time and O(n) space
    /*
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        int [] temp = new int[n];
        
        // When d is greater than, n
        d %= n;
        
        // Copy last n - d elements to the front of temp
        for (int i = 0; i < n - d; i++)
            temp[i] = arr[d + i];

        // Copy the first d elements to the back of temp
        for (int i = 0; i < d; i++)
            temp[n - d + i] = arr[i];
            
        // Copying the elements of temp in arr to get the final rotated array
        for(int i = 0; i < n; i++)
            arr[i] = temp[i];
    }
  */
   // Reversal Algortihm --O(n) time and O(1) space : The idea is based on the observation that if we left rotate the array by d positions, 
    // the last (n - d) elements will be at the front and the first d elements will be at the end. 
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        
        // When d > n
        d %= n;
        
        // Step 1: Reverse the subarray containing the first d elements of the array.
        reverse(arr, 0, d - 1);

        // Step 2: Reverse the subarray containing the last (n - d) elements of the array.
        reverse(arr, d, n - 1);
        
        // Step 3: Finally, reverse all the elements of the array.
        reverse(arr, 0, n - 1);
    }
    
    static void reverse(int[] arr, int i, int j){
        // Reversal using two-pointer approach
        while(i < j){
            int num = arr[i];
            arr[i++] = arr[j];
            arr[j--] = num;
        }
    }
