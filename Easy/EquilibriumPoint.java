class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        /* Brute Force Approach : O(n^2)
        int i = 0;
        for(; i < arr.length; i++){
            int leftSum = 0;
            int rightSum = 0;
            int j = i - 1;
            while(j >= 0){
                leftSum += arr[j--];
            }
            j = i + 1;
            while(j < arr.length){
                rightSum += arr[j++];
            }
            if(leftSum == rightSum)
                return i;
        }
        return -1;
        */
      /*Optimized Approach : O(n)
        Instead of checking sums on both sides for each index
        First, calculate the total sum of all elements.
        Then, as you walk through the array, keep track of the sum on the left.
        rightSum = totalSum - leftSum - arr[i];
        */
        int totalSum = 0;
        for(int i = 0; i < arr.length; i++){
            totalSum += arr[i];
        }
        int leftSum = 0;
        for(int i = 0; i < arr.length; i++){
            if(leftSum == totalSum - leftSum - arr[i])
                return i;
            leftSum += arr[i];
        }
        return -1;
    }
}
