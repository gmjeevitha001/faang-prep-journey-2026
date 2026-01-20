class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        
        // Outer loop: for each index i
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            
            // Inner loop: sum from nums[0] to nums[i]
            for (int j = 0; j <= i; j++) {
                sum += nums[j];
            }
            
            result[i] = sum;
        }
        
        return result;
    }
}
