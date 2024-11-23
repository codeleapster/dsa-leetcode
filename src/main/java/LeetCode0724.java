import java.util.stream.IntStream;

public class LeetCode0724 {

    public int approachOne(int[] nums) {
        int n = nums.length;
        int[] pfSum = new int[n];
        int[] sfSum = new int[n];
        pfSum[0] = nums[0];
        for(int i = 1; i < n; i++) {
            pfSum[i] = pfSum[i-1] + nums[i];
        }

        sfSum[n-1] = nums[n-1];
        for(int i = n-2; i >=0; i--) {
            sfSum[i] = sfSum[i+1] + nums[i];
        }

        for (int i = 0; i < n; i++) {
            if(sfSum[i] == pfSum[i]) {
                return i;
            }
        }
        return -1;
    }

    public int approachTwo(int[] nums) {
        // totalSum = 0
        // leftSum = 0
        // for i -> 0 to n-1
        //      totalSum = totalSum + nums[i]
        //
        // for i -> 0 to n-1
        //      if(totalSum - nums[i] == leftSum * 2)
        //          return i
        //      leftSum = leftSum + nums[i]
        // return -1

        int totalSum = 0;
        int leftsum = 0;

        for (int ele : nums) {
            totalSum += ele;
        }

        for (int i = 0; i < nums.length; i++) {
            if (totalSum - nums[i] == leftsum * 2) {
                return i;
            }
            leftsum += nums[i];
        }

        return -1;
    }

    // visualize the solution as left and right weighing scale
    public int approachThree(int[] nums) {
        int leftSum = 0;
        int rightSum = IntStream.of(nums).sum();

        for (int i = 0; i < nums.length; i++) {
            rightSum = rightSum-nums[i];
            if(leftSum == rightSum) {
                return i;
            }
            leftSum = leftSum+nums[i];
        }
        return -1;
    }
}