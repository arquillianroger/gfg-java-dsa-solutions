class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> duplicates = new ArrayList<>();
        /* Brute Force Approach : O(n^2) --Nested Loops
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j] && !duplicates.contains(nums[i]))
                duplicates.add(nums[i]);
            }
        }
        */
        /*Sorting Based Approach : O(nlogn)
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1] && !duplicates.contains(nums[i]))
            duplicates.add(nums[i]);
        }
        */
        /*Optimized Approach : O(n) --Index Marking Trick
        So when you encounter a number x:
        1. Jump to index x-1.
        2. If it’s still positive → mark it negative → “first visit”.
        3. If it’s already negative → “second visit” → that’s a duplicate.
        */
        for(int i = 0; i < nums.length; i++){
            int x = Math.abs(nums[i]);
            if(nums[x - 1] > 0)
            nums[x - 1] = - nums[x - 1];
            else
            duplicates.add(x);
        }
        //Restoring the array back to its original state
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
        }
        return duplicates;
    }
}
