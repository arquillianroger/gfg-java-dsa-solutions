class Solution {
    public int prime_Sum(int n) {
        //Brute Force Approach : O(n * sqrt(n))
        int sum = 0;
        while(n > 1){
            boolean isPrime  = true;
            for(int i = 2; i * i <= n; i++){
                if(n % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) sum += n;
            n--;
        }
            */
    */
    // Sieve Of Eratosthenes : O(nloglogn)
/*Steps : 
1. Create a boolean array isPrime of size n+1, initialized to true. As, by default all the values will be false
2. Mark 0 and 1 as not prime.
3. For each number p from 2 to √n:
    -> If isPrime[p] is true → mark all multiples of p as not prime.
    -> After sieve, all true indices are primes.
4. Traverse array and sum up primes.
*/
        boolean[] isPrime = new boolean[n + 1];
        for(int i = 2; i <= n; i++)
            isPrime[i] = true;
        // sieve
        for(int num = 2; num * num <= n; num++){
            if(isPrime[num]){
                for(int multiple = num * num; multiple <= n; multiple += num){
                    isPrime[multiple] = false;
                }
            }
        }
        int sum = 0;
        for(int i = 0; i <= n; i++){
            if(isPrime[i])  sum += i;
        }
        return sum;
    }
}
