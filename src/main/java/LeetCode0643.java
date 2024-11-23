public class LeetCode0643 {
    public double findMaxAverage(int[] nums, int k) {
        // sum = 0
        // for i -> 0 to k-1
        //      sum = sum + nums[i]
        // max = sum
        // for i -> k to n-1
        //      sum = sum + nums[i] - nums[i-k]
        //      max = bigger(max, sum)
        // return max/k

        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum = sum + nums[i];
        }

        int max = sum;
        for(int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i-k];
            max = Integer.max(max, sum);
        }

        return (double) max /k;
    }
}