class Solution {
    int missingNum(int arr[]) {
        /* Brute Force Approach : O(nlogn)
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != i + 1){
                missingElement = i + 1;
                break;
            }
        }
        if(missingElement == 0)
        missingElement = arr.length + 1;
        */
        /* Sum Formula : O(n) approach
        long n = arr.length + 1;
        long sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        //Sum of first n natural numbers = n * (n + 1) / 2
        long total = n * (n + 1) / 2;
        return (int) (total - sum); 
        */
        /*XOR approach : O(n) approach -- to avoid integer overflow
        if you XOR all numbers from 1..n with all elements of the array, 
        the duplicates cancel out and only the missing number remains.
        */
        int xor = 0;
        for(int i = 0; i <= n; i++){
            xor ^= i;
        }
        for(int num : arr){
            xor ^= num;
        }
        return xor;
    }
}
