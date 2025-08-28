class Solution {
    public void sortInWave(int arr[]) {
        // code here
/*For this problem even though it might look like there could be multiple ways to arrange elements in a wave, 
the problem specifically asks for the lexicographically smallest one if there are multiple solutions.
Since the array is already sorted, and we swap every adjacent pair (starting from index 0), this method always gives the 
lexicographically smallest wave array. So, for a given sorted input, there's only one valid solution that meets the problem's requirement.
But actually, if you start swapping from index 1 instead of index 0, you could get a different arrangement, especially for arrays with 
more than three elements. That’s why the standard method always swaps starting from index 0 to ensure the lexicographically smallest wave.
*/
        for(int i = 0; i < arr.length - 1; i += 2){
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
}
