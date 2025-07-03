import java.util.Arrays;
import java.util.Scanner;

public class chocolates {
    public static int chocolate(int[] prize, int money) {
        Arrays.sort(prize);
        int mincost = prize[0] + prize[1];

        if (mincost <= money) {
            return money - mincost;
        } else {
            return money;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of chocolate");
        int n = sc.nextInt();
        int[] prize = new int[n];
        System.out.println("Enter the prices of chocolate");
        for (int i = 0; i < n; i++) {
            prize[i] = sc.nextInt();
        }
        System.out.println("Enter the money you have");
        int money = sc.nextInt();

        int result = chocolate(prize, money);
        System.out.println("Enter the money you left "  +  result);

    }
}
