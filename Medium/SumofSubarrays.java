class Solution {
    public int subarraySum(int[] arr) {
        int totalSum = 0;
        /*Brute Force Approach : O(n^2) --Actually generating subarrays
        for(int i = 0; i < arr.length; i++){
            int subArraySum = 0;
            for(int j = i; j < arr.length; j++){
                subArraySum += arr[j];
                totalSum += subArraySum;
            }
            //For arr : [1,2,3]
            //Subarrays : [1], [2], [3], [1, 2], [2, 3], [1, 2, 3] 
            //[1] (1) -> [1,2] (4) -> [1,2,3] (10) -> [2] (12) -> [2,3] (17) -> [3] (20)
        }
        */
        //Optimized Approach : O(n) --Contribution Based
        for(int i = 0; i < arr.length; i++){
            totalSum += arr[i] * (i + 1) * (arr.length - i);
        }
        /*
        Example: [1, 2, 3].
        -> 1 appears in subarrays starting at index 0: [1], [1,2], [1,2,3]. That’s 3 times.
        -> 2 appears in [2], [1,2], [2,3]. That’s 4 times.
        -> 3 appears in [3], [2,3], [1,2,3]. That’s 3 times.
        So total = 1*3 + 2*4 + 3*3 = 3 + 8 + 9 = 20.

        This trick comes from thinking: For element at index i (0-based),
        -> Number of choices for left boundary = i + 1, (because l can be anywhere from 0 to i).
        -> Number of choices for right boundary = n - i, (because r can be anywhere from i to n - 1).
        So contribution = arr[i] * (i + 1) * (n - i).

        This gives us O(n) directly.
        */
        return totalSum;
    }
}
