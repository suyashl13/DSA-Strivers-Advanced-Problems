/**
 * SearchInRotatedArray
 */
public class SearchInRotatedArray {

    public int search(int[] nums, int k) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int midElement = nums[mid];
            
            if (midElement == k) return mid;
            

            if (midElement >= nums[low]) {
                if (nums[low] <= k && k <= midElement) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] <= k && k <= nums[high]) {
                    low = mid +1;
                } else {
                    high = mid - 1;
                }
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        SearchInRotatedArray solver = new SearchInRotatedArray();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int index = solver.search(nums, target);
        System.out.println("Target " + target + " found at index: " + index);
    }
}