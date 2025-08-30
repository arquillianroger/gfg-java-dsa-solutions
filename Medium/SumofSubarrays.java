class Solution {
    public int subarraySum(int[] arr) {
        /*Brute Force Approach : O(n^2) --Actually generating subarrays
        int totalSum = 0;
        for(int i = 0; i < arr.length; i++){
            int subArraySum = 0;
            for(int j = i; j < arr.length; j++){
                subArraySum += arr[j];
                totalSum += subArraySum; 
                //For arr : [1,2,3]
                //Subarrays : [1], [2], [3], [1, 2], [2, 3], [1, 2, 3] 
                //[1] (1) -> [1,2] (4) -> [1,2,3] (10) -> [2] (12) -> [2,3] (17) -> [3] (20)
            }
        }
        return totalSum;
        */
        
    }
}
