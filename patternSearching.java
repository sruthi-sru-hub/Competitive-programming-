import java.util.*;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String pattern = sc.nextLine();

        int n = text.length();
        int m = pattern.length();

        int[] arr = new int[m];

        int i = 1;
        int j = 0;

        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(j)) {
                j++;
                arr[i] = j;
                i++;
            } else {
                if (j != 0) {
                    j = arr[j - 1];
                } else {
                    arr[i] = 0;
                    i++;
                }
            }
        }

        
        i = 0;
        j = 0;

        while (i < n) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;

                if (j == m) {
                    System.out.println(i - j);
                    j = arr[j - 1];
                }
            } else {
                if (j != 0) {
                    j = arr[j - 1];
                } else {
                    i++;
                }
            }
        }
    }
}
