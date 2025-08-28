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
      //Optimized Approach : O(n)
    }
}
