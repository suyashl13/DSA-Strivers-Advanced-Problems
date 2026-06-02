public class MaximumProductInSubArray {

    public int maxProduct(int[] nums) {
        int suffix = 1;
        int prefix = 1;
        int ans = Integer.MIN_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            if (suffix == 0) suffix = 1;
            if (prefix == 0) prefix = 1;
            
            suffix = suffix * nums[i];
            prefix = prefix * nums[nums.length - 1 - i];
            ans = Math.max(ans, Math.max(suffix, prefix));
        }
        
        return ans;
    }
}