
//import java.lang.*;
import java.util.*;

/**
 * Missing_number
 */
public class Missing_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i < n - 1; i++) {
            int v = sc.nextInt();
            if (!h.contains(v)) {
                h.add(v);
            }
        }
        for (int i = 1; i <= n; i++) {
            if (!h.contains(i)) {
                System.out.println(i);
                break;
            }
        }

        sc.close();
    }
}