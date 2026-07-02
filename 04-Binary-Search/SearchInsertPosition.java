public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int mid = low + (high - low) / 2;

        while (low <= high) {
            if (target == nums[mid]) {
                return mid;
            }

            if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

            mid = low + (high - low) / 2;
        }

        return mid;

    }
}
