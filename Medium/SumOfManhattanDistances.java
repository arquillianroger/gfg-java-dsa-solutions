package complete_java;

import java.util.Arrays;

public class SumOfManhattanDistances {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

//        int n = scanner.nextInt();
        int[] x = { -1, 1, 3, 2 };
        int[] y = { 5, 6, 5, 3 };
//      read input from keyboard ->
//        for(int i = 0; i < n; i++){
//            x[i] = scanner.nextInt();
//            y[i] = scanner.nextInt();
//        }
      
        System.out.println(solution(x, y, x.length));
    }
//    Brute Force Approach : O(n^2) time and O(1) space
    /*
    x[] represents x co-ordinates, y[] represents y co-ordinates
    static int solution(int[] x, int[] y, int n){
        int sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++)
                sum += Math.abs(x[i] - x[j]) + Math.abs(y[i] - y[j]);
        }
        return sum;
    }
    */
//    Optimized Approach : O(nlogn) time and O(1) space
    static int solution(int[] x, int[] y, int n) {
        return distanceSum(x, n) + distanceSum(y, n);
    }

    static int distanceSum(int[] arr, int n){
        Arrays.sort(arr);
        int sum = 0;
        int res = 0;

        for(int i = 0; i < n; i++){
            res += (arr[i] * i - sum);
            sum += arr[i];
        }

        return res;
    }
}
