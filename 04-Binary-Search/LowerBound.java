public class LowerBound {
    public int lowerBound(int[] nums, int x) {
        int high = nums.length - 1;
        int low = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (x == nums[mid]) {
                return mid;
            }

            if (x <= nums[mid]) {
                return mid;
            } else {
                high = mid;
            }

        }

        return nums.length;
    }
}
