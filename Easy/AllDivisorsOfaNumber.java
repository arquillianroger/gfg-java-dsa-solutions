class Solution {
    public static void print_divisors(int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1, j = 0; i <= Math.sqrt(n); i++)
        {
            if(n % i == 0)
            {
                System.out.print(i + " ");
                if(i != n / i)
                list.add(n / i);
            }
        }
        for (int i = list.size() - 1; i >= 0; i--)
        System.out.print(list.get(i) + " ");
    }
}
