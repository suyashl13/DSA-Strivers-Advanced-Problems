import java.util.Arrays;

class AggressiveCows {

    private static boolean isPossible(int[] nums, int cows, int gap) {
        if (nums.length < cows) return false;

        int lastCowPosition = nums[0];
        int cowsPlaced = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - lastCowPosition >= gap) {
                cowsPlaced++;
                lastCowPosition = nums[i];
                if (cowsPlaced == cows) {
                    return true;
                }
            }
        }

        return false;
    }

    public int aggressiveCows(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) return 0;

        Arrays.sort(nums);
        int low = 1;
        int high = nums[nums.length - 1] - nums[0];
        int answer = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(nums, k, mid)) {
                answer = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return answer;
    }
}
