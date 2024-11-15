import java.util.Arrays;

public class LeetCode0334 {

    //brute force
    // TC: O(n^3)
    // SC: O(1)
    public boolean approachOne(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }

        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                for (int k = j + 1; k < len; k++) {
                    if (nums[i] < nums[j] && nums[j] < nums[k]) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    // dynamic programming
    // TC: O(n^2)
    // SC: O(n)
    public boolean approachTwo(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        Arrays.fill(dp, 1);

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = dp[j] + 1;
                }

                if (dp[i] >= 3) {
                    return true;
                }
            }
        }
        return false;
    }

    // two pointers approach
    // TC: O(n)
    // SC: O(n)
    public boolean approachThree(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }

        int len = nums.length;
        int[] leftMin = new int[len];
        leftMin[0] = nums[0];
        for (int i = 1; i < len; i++) {
            leftMin[i] = Math.min(leftMin[i - 1], nums[i]);
        }

        int[] rightMax = new int[len];
        rightMax[len - 1] = nums[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], nums[i]);
        }

        for (int i = 0; i < len; i++) {
            if (nums[i] > leftMin[i] && nums[i] < rightMax[i]) {
                return true;
            }
        }

        return false;
    }

    // best - greedy approach
    // TC: O(n)
    // SC: O(1)
    public boolean approachFour(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n <= first) {
                first = n;
            } else if (n <= second) {
                second = n;
            } else {
                return true;
            }
        }
        return false;
    }
}
