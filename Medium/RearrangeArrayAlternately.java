class Solution {
    public void rearrange(int arr[]) {
        /* Brute Force Approach : O(n^2) --Sorting the array, taking the max element, 
        shifting the array then, placing the max element at its correct position
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i += 2){
            int j = arr.length - 1;
            int num = arr[j];
            // shift elements one step to the right
            for(; j > i; j--){
                arr[j] = arr[j - 1];
            }
            // place the picked element at correct position
            arr[i] = num;
        }
        */
        // Optimised Approach -- O(n)
        return;
    }
}
