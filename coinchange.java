import java.util.Arrays;

public class CoinChangeMin {

    static int minCoins(int coins[], int amount) {
        int dp[] = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int coins[] = {1, 2, 5};
        int amount = 11;
        int result = minCoins(coins, amount);

        if (result == -1) {
            System.out.println("Cannot make the amount with given coins.");
        } else {
            System.out.println("Minimum coins required: " + result);
        }
    }
}
