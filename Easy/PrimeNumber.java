class Solution {
    static boolean isPrime(int n) {
        /*Brute-Force approach : O(n)
        if(n > 1)
        {
            for(int i = 2; i <= n - 1; i++)
            {
                if(n % i == 0)    return false;
            }
            return true;   
        }
        return false;
        */
        //Optimised approach : O(sqrt(n))
        if(n > 1)
        {
            for(int i = 2; i * i <= n; i++)
            {
                if(n % i == 0)    return false;
            }
            return true;   
        }
        return false;
    }
}
