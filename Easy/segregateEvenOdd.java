class Solution {
    void segregateEvenOdd(int arr[]) {
        // code here
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int num : arr)
        {
            if(num % 2 == 0)
            even.add(num);
            else
            odd.add(num);
        }
        
        if(even.isEmpty() || odd.isEmpty())
        return;
        
        Collections.sort(even);
        Collections.sort(odd);
        
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
