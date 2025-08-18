// User function Template for Java

class Solution {
    boolean isDigitSumPalindrome(int n) {
        // code here
        int sum = 0;
        while(n > 0)
        {
            sum += n % 10;
            n /= 10;
        }
        int number = sum;
        while(sum > 0)
        {
            //n is now reverse of digits of sum
            n = n * 10 + sum % 10;
            sum /= 10;
        }
        boolean isSumOfDigitsPalindrome = n == number ? true : false;
        return isSumOfDigitsPalindrome;
    }
}
