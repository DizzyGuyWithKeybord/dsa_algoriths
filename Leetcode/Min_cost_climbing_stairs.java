import java.util.*;

public class Min_cost_climbing_stairs {
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];

        Arrays.fill(dp, -1);

        // initializing
        dp[n] = 0;
        for (int i = n - 1; i >= 0; i--) {
            dp[i] = i + 2 < n + 1 ? Math.min(cost[i] + dp[i + 1], cost[i] + dp[i + 2]) : cost[i] + dp[i + 1];
        }
        return 1 < n + 1 ? Math.min(dp[0], dp[1]) : dp[0];
    }

    public static void main(String[] args) {
        int cost[] = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
        System.out.println(minCostClimbingStairs(cost));
    }
}

/*
 * Input: cost = [1,100,1,1,1,100,1,1,100,1]
 * Output: 6
 * Explanation: You will start at index 0.
 * - Pay 1 and climb two steps to reach index 2.
 * - Pay 1 and climb two steps to reach index 4.
 * - Pay 1 and climb two steps to reach index 6.
 * - Pay 1 and climb one step to reach index 7.
 * - Pay 1 and climb two steps to reach index 9.
 * - Pay 1 and climb one step to reach the top.
 * The total cost is 6.
 */
