import java.util.*;

public class Solution {

    public static void maxsubarray(int[] num) {
        int max = num[0];
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum += num[i];

            if (sum > max) {
                max = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        System.out.println(max);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num[] = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        maxsubarray(num);
    }
}
