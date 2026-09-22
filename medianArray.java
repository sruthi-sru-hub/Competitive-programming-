import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        int total = n + m;

        int i = 0, j = 0;
        int prev = 0, curr = 0;

        for (int k = 0; k <= total / 2; k++) {
            prev = curr;

            if (i < n && (j >= m || a[i] <= b[j])) {
                curr = a[i++];
            } else {
                curr = b[j++];
            }
        }

        if (total % 2 == 1) {
            System.out.printf("%.1f%n", (double) curr);
        } else {
            double median = (prev + curr) / 2.0;
            System.out.printf("%.1f%n", median);
        }

        sc.close();
    }
}
