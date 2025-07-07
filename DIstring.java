import java.util.*;

public class DIstring {

    public static int[] diStringMatch(String s) {
        int n = s.length();
        int[] result = new int[n + 1];
        int low = 0, high = n;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                result[i] = low;
                low++;
            } else {  // 'D'
                result[i] = high;
                high--;
            }
        }

        // The last remaining number
        result[n] = low;

        return result;
    }

    public static void main(String[] args) {
        String s = "IDID";  // You can change input here
        int[] result = diStringMatch(s);

        System.out.println(Arrays.toString(result));
    }
}
