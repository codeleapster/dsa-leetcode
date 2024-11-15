public class LeetCode0238 {

    // Brute force will not work for bigger numbers as the product will go beyond 2^32
    public int[] approachOne(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int product = 1;
            for(int j=0; j<n; j++) {
                if(i==j) {
                    continue;
                }
                product *= nums[j];
                if(nums[j] == 0) {
                    break;
                }
            }
            ans[i] = product;
        }

        return ans;
    }

    // This will not work for inputs that has zeroes
    public int[] approachTwo(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int pro = 1;
        for(int i : nums) {
            pro *= i;
        }

        for(int i = 0; i < n; i++) {
            ans[i] = pro / nums[i];
        }
        return ans;
    }

    //
    public int[] approachThree(int[] nums) {
        int n = nums.length;

        // construct prefix array
        int[] pf = new int[n];
        pf[0] = nums[0];
        for (int i = 1; i < n; i++) {
            pf[i] = pf[i-1] * nums[i];
        }

        // construct suffix array
        int[] sf = new int[n];
        sf[n-1] = nums[n-1];
        for (int i = n-2; i >= 0; i--) {
            sf[i] = sf[i+1] * nums[i];
        }

        // construct final output array
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            if(i == 0) {
                ans[i] = sf[i+1];
            } else if(i == n-1) {
                ans[i] = pf[i-1];
            } else {
                ans[i] = pf[i-1] * sf[i+1];
            }
        }
        return ans;
    }

}
