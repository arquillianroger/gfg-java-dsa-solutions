class Solution {
    static boolean isPrime(int n) {
        // code here
        if(n > 1)
        {
            for(int i = 2; i * i <= n; i++)
            {
                if(n % i == 0)
                {
                    return false;
                }
            }
            return true;   
        }
        return false;
    }
}
