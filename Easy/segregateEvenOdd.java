class Solution {
    void segregateEvenOdd(int arr[]) {
        // code here
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

        //Checking if the list is empty then, returning the given array as it is (without any sorting) 
        //as segregation needs to be done only when both even and odd numbers are present in the given array
        if(even.isEmpty() || odd.isEmpty())
        return;

        //sorting both the lists
        Collections.sort(even);
        Collections.sort(odd);

        // Merging the sorted elements to array
        int index = 0;
        for(int num : even)
        {
            arr[index++] = num;
        }
        
        for(int num : odd)
        {
            arr[index++] = num;
        }
        return;
    }
}
