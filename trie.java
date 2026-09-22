
import java.util.*;

class Solution {

    static class Node {
        Node[] child = new Node[26];
        boolean end = false;
    }

    static Node root = new Node();

    static void insert(String s) {
        Node curr = root;

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';

            if (curr.child[index] == null) {
                curr.child[index] = new Node();
            }

            curr = curr.child[index];
        }

        curr.end = true;
    }

    static int search(String s) {
        Node curr = root;

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';

            if (curr.child[index] == null) {
                return 0;
            }

            curr = curr.child[index];
        }

        return curr.end ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());

        String[] words = sc.nextLine().trim().split(",");

        String target = sc.nextLine().trim();

        for (String word : words) {
            insert(word.trim());
        }

        System.out.println(search(target));

        sc.close();
    }
}
