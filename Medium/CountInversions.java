class Solution {
    // Brute Force Approach -- O(n^2) [Got TLE]
    /*
    static int inversionCount(int arr[]) {
        int count = 0;
        boolean isSorted = true;
        // checks if array is sorted in ascending order or not
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i + 1]){
                isSorted = false;
                break;
            }
        }
        // if array is sorted in ascending order then, inversion count will be zero as every previous element is smaller then its next element.
        if(isSorted)
        return count;
        
        else{
            for(int i = 0; i < arr.length - 1 ; i++){
                for(int j = i + 1; j < arr.length; j++){
                    // No need to check for i < j as i[0, n-2], j[i+1, n-1] 
                    if(arr[i] > arr[j])
                    count +=1;
                }
            }
        }
        return count;
        */
    //Optimised Approach : O(nlogn) time and O(n) space -> Merge Sort
    static int inversionCount(int arr[]) {
        int count = mergeSort(arr, 0, arr.length - 1);
        return count;
    }
    // Merge sort
    static int mergeSort(int[] arr, int low, int high){
        int count = 0;
        if(low < high) {
            int mid = (low + high) / 2;
            // Count inversions in left half
            count += mergeSort(arr, low, mid);
            // Count inversions in right half
            count += mergeSort(arr, mid + 1, high);
            // Count inversions while merging
            count += merge(arr, low, mid, high);
        }
        // Return sum of all three
        return count;
    }
    
    static int merge(int[] arr, int low, int mid, int high){
        List<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        int count = 0;
        
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right])
            list.add(arr[left++]);
            else{
                list.add(arr[right++]);
                // Counting inversions
                count += mid - left + 1;
            }
        }
        
        while(left <= mid)
        list.add(arr[left++]);
        
        while(right <= high)
        list.add(arr[right++]);
        
        for(int i = low; i <= high; i++)
        arr[i] = list.get(i - low);
        
        return count;
    }
}
