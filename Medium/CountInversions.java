class Solution {
    static int inversionCount(int arr[]) {
        // Code Here
        int count = 0;
        for(int i = 0; i <= arr.length - 2; i++)
        {
            //No need to check for i < j as i[0, n-2], j[i+1, n-1] 
            for(int j = i + 1; j <= arr.length - 1; j++)
            {
                if(arr[i] > arr[j])
                count ++;
            }
        }
        return count;
    }
}
