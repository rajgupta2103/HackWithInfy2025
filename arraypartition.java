import java.util.*;

public class arraypartition {

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter even number of integers:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the integers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = arrayPairSum(nums);
        System.out.println("Maximum possible sum is: " + result);
    }
}
