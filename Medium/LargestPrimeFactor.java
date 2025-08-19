// User function Template for Java

class Solution {
    static int largestPrimeFactor(int n) {
        // code here
      //O(n) approach
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
    }
}
