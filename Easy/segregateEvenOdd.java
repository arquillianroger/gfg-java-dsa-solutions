class Solution {
    void segregateEvenOdd(int arr[]) {
        // Brute Force Approach : O(nlogn) time and O(n) space
        /*
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        
        //Assigning even numbers to even list and odd numbers to odd list
        for(int num : arr)
        {
            if(num % 2 == 0)
            even.add(num);
            else
            odd.add(num);
        }

        //Checking if any of the list is empty then, return the given array as it is (without any sorting) 
        //as segregation needs to be done only when both even and odd numbers are present in the given array
        if(even.isEmpty() || odd.isEmpty())
        return;

        //sorting both the lists
        Collections.sort(even);
        Collections.sort(odd);

        // Merging the sorted lists to original array
        int index = 0;
        for(int num : even)
            arr[index++] = num;
        
        for(int num : odd)
            arr[index++] = num;
    }
    */
    // Optimised approach : O(nlogn) time and O(1) space -> in-place modification
        /*
        Intuition for in place approach :
        1. Instead of using two separate lists one for even numbers and another for odd numbers,
        Traverse array once, place all evens to the left, odds to the right using two pointer approach.
        2. Sort left(even numbers) and right(odd numbers) segments individually.
        */
    void segregateEvenOdd(int arr[]) {
        int low = 0;
        int high = arr.length - 1;
        int i = low;
        int j = high;
        while(i < j){
            // find odd numbers from left
            while(arr[i] % 2 == 0 && i <= high - 1) 
                i++;
            // find even numbers from right
            while(arr[j] % 2 != 0 && j >= low + 1) 
                j--;
            // swap so that, even numbers are on the left and odd numbers are on the right of array
            if(i < j)
                swap(arr, i, j);
        }
        // sort even numbers
        quickSort(arr, low, j);
        // sort odd numbers
        quickSort(arr, i, high);
    }
    // Sort using Quick Sort to make solution space efficient
    void quickSort(int[] arr, int low, int high){
        if(low < high){
            int partition = givesPartition(arr, low, high);
            quickSort(arr, low, partition - 1);
            quickSort(arr, partition + 1, high);
        }
    }
        
    int givesPartition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        
        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }
        
    void swap(int[] temp, int i, int j){
        int num = temp[i];
        temp[i] = temp[j];
        temp[j] = num;
    }
}
