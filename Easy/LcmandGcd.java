class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int [] arr = new int [2];
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        while(min != 0)
        {
            int temp = min;
            min = max % min;
            max = temp;
        }
        arr[1] = max;
        arr[0] = (a * b) / arr[1];
        return arr;
    }
}
