class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int first = binarySearch(arr, target, true);
        // if the element is not present
        if(first == -1) return 0;
        
        int last = binarySearch(arr, target, false);
        
        return last - first + 1;
    }
    
    int binarySearch(int[] arr, int target, boolean firstOccurrence){
        int start = 0;
        int end = arr.length - 1;
        int res = -1;
        while(start <= end){
            int mid = start + (end -start) / 2;
            if(target == arr[mid]){
                res = mid;
                // first occurrence
                if(firstOccurrence) end = mid - 1;
                // last occurrence
                else start = mid + 1;
            }
                else if(target > arr[mid]) start = mid + 1;
                else end = mid - 1;
        }
        return res;
    }
}
