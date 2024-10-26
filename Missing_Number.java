//import java.lang.*;
import java.util.*;

/**
 * While you are using this code in CSES you need to repalce class name  Missing_number with Main.
 */
public class Missing_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> h = new HashSet<>();
        // Instaed of using array to store values and pushing values into HashSet to avoid duplicate occurance we are directly using HashSet to store input 
        for (int i = 0; i < n - 1; i++) {
            int v = sc.nextInt();              // taking input from console 
            if (!h.contains(v)) {
                h.add(v);
            }
        }
        for (int i = 1; i <= n; i++) {
            if (!h.contains(i)) {
                System.out.println(i);
                break;
                //ravi
            }
        }

        sc.close();
    }
}
