class Solution {
    static int evenlyDivides(int n) {
        // code here
        byte count = 0;
        int number = n;
        while(n > 0)
        {
            byte digit = (byte) (n % 10);
            if(digit != 0)
            {
                count = number % digit == 0 ? ++count : count;
            }
            n /= 10;
        }
        return count;
    }
}
