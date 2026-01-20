// Time Complexity: O(m × n)
// Space Complexity: O(1)

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        // Outer loop: each customer
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0; // reset for each customer

            // Inner loop: sum all accounts of this customer
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            // Track the richest
            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }

        return maxWealth;
    }
}
