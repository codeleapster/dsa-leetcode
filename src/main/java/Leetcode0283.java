public class Leetcode0283 {

    public void approachOne(int[] nums) {
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pos] = nums[i];
                pos++;
            }
        }

        while (pos < nums.length) {
            nums[pos++] = 0;
        }
    }

    public void approachTwo(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            // If array at i index is not zero then swap and increment j by one
            if (nums[i] != 0) {
                int x = nums[i];
                nums[i] = nums[j];
                nums[j] = x;
                j++;
            }
        }
    }


}
