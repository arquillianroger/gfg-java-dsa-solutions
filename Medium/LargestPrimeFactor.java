class Solution {
    static int largestPrimeFactor(int n) {
      //Brute force approach : O(n)
       /*
        boolean isPrime = true;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 2; i <= Math.sqrt(n); i++)
        {
            if(n % i == 0)
            {
                isPrime = false;
                list.add(i);
                if(i != n / i)
                list.add(n / i);
            }
        }
        if(isPrime)
        return n;
        int max = 0;
        for(int i = 0; i < list.size(); i++)
        {
            isPrime = true;
            int factor = list.get(i);
            for(int j = 2; j <= Math.sqrt(factor); j++)
            {
                if(factor % j == 0)
                {
                    isPrime = false;
                }
            }
            if(isPrime)
            max = Math.max(factor, max);
        }
        return max;
        */
        //O(sqrt(n)) approach
        /*
        We can directly find the largest prime factor in one pass:
        -> Divide out factors of 2 until n is odd. Keep track of 2 if it divides.
        -> Check odd factors from 3 … √n.
        -> While factor divides n, divide it out and update answer.
        -> If after the loop n > 2, then n itself is a prime (and the largest prime factor).
            */
        int maxPrime = 1;
        
        // remove factors of 2
        while(n % 2 == 0){
            maxPrime = 2;
            n /= 2;
        }
        
        // check odd factors
        for(int i = 3; i * i <= n; i += 2){
            while(n % i == 0){
                maxPrime = i;
                n /= i;
            }
        }
        
        // if n > 2 this means that n is a prime number
        if(n > 2)   maxPrime = n;
        return maxPrime;
    }
}
