import java.util.*;

public class Solution {

    public static void ascarray(int[] arr) {
        int min = arr[0];
        int Sum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > arr[i - 1]) {
                min += arr[i];
            } else {
                min = arr[i];
            }

            if (min > Sum) {
                Sum = min;
            }
        }

        System.out.println(Sum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ascarray(arr);
    }
}
