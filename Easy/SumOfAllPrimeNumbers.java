class Solution {
    public int prime_Sum(int n) {
        // code here
      //O(n * sqrt(n)) solution
        int sum = 0;
        for(int num = 1; num <= n; num++)
        {
            boolean isPrime = true;
            if(num > 1)
            {
                for(int j = 2; j <= Math.sqrt(num); j++)
                {
                    if(num % j == 0)
                    {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime)
                sum += num;
            }
        }
        return sum;
    }
}
