// Time Complexity: O(m × n)
// Space Complexity: O(1)
// Efficient, clean, and practical for this problem.

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int[] customer : accounts) {
            int sum = 0;
            for (int money : customer) {
                sum += money;
            }
            maxWealth = Math.max(maxWealth, sum);
        }

        return maxWealth;
    }
}
