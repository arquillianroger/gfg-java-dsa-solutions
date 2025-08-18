class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int number = n;
        short totalSum = 0;
        for(byte i = 1; i <= 3; i++)
        {
            byte digit = (byte) (n % 10);
            totalSum += (short) Math.pow(digit, 3);
            n /= 10;
        }
        if(totalSum == number)
            return true;
        return false;
    }
}
