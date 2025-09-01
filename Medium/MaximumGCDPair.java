// User function Template for Java

class Solution {
     static int MaxGcd(int n, int a[]) {
        /* Brute Force Approach : O(n^2log(max))
        int maxGcd = 0;
        int gcd = 0;
        for(int i = 0; i < a.length; i++)
        {
            for(int j = i + 1; j < a.length ; j++)
            {
                int max = Math.max(a[i], a[j]);
                int min = Math.min(a[i], a[j]);
                //Euclidean Algorithm
                while(min != 0)
                {
                    int temp = min;
                    min = max % min;
                    max = temp;
                }
                gcd = max;
                maxGcd = Math.max(gcd, maxGcd);
            }
        }
        return maxGcd;
        */
        /*Optimised Approach : O(nlog(maxElement))
        Intuition :
        The maximum GCD of any pair in the array cannot be larger than the maximum element in the array.
        -> gcd(a, b) <= min(a, b)
        -> therefore, gcd(a[i], a[j]) <= min(a[i], a[j])
        -> this implies gcd(a[i], a[j]) <= max(array)
        */
        // Step 1 : Find Maximum Element
        int maxElement = 0;
        for(int num : a){
            maxElement = Math.max(maxElement, num);
        }
        /* Step 2 : Count Frequency of Each Number, using index as the multiple of divisor
        Need of freq[] : If we just loop divisors d and want to check how many numbers are divisible by d,
        we’d need to scan the whole array for every divisor → O(n * maxElement) */
        int[] freq = new int[maxElement + 1]; //Takes O(n) for building
        for(int num : a){
            freq[num]++;
        }
        // Step 3 : Count multiples of each divisor
        for(int d = maxElement; d >= 1; d--){
            int multipleCount = 0;
            for(int j = d; j <= maxElement; j += d){
                //if d = 2 -> j = 2 
                //next multiple will be at j += d, that is at j =4; Jump directly to the multiples of 2 and sum. 
                multipleCount += freq[j];
            }
            if(multipleCount >= 2)
            return d; // As, we check from maxElement to 1, first divisor with at least 2 multiples will be the max GCD
        }
        return 1;
    }
}
