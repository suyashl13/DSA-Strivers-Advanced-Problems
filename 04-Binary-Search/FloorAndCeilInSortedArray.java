public class FloorAndCeilInSortedArray {
    public int[] getFloorAndCeil(int[] nums, int x) {
        int[] solution = { nums[0], nums[nums.length - 1] };
        int high = nums.length - 1, low = 0;
        int mid = low + (high - low) / 2;

        while (low <= high) {
            mid = low + (high - low) / 2;

            if (nums[mid] == x)
                return new int[] { x, x };
            if (x < nums[mid]) {
                high = mid - 1;
                solution[0] = high < 0 ? -1 : nums[high];
            } else {
                low = mid + 1;
                solution[1] = low >= nums.length ? -1 : nums[low];
            }
        }

        if (solution[0] == -1) solution[1] = nums.length > 0 ? nums[0] : -1;
        if (solution[1] == -1) solution[0] = nums.length > 0 ? nums[nums.length -1] : -1;

        return solution;
    }
    
    public static void main(String[] args) {
        FloorAndCeilInSortedArray solver = new FloorAndCeilInSortedArray();
        int[] nums = { 325, 382, 556, 684, 742 };
        int x = 45;

        int[] result = solver.getFloorAndCeil(nums, x);
        System.out.println("Input: " + java.util.Arrays.toString(nums) + ", x = " + x);
        System.out.println("Floor = " + result[0] + ", Ceil = " + result[1]);

        // x = 10;
        // result = solver.getFloorAndCeil(nums, x);
        // System.out.println("Input: " + java.util.Arrays.toString(nums) + ", x = " +
        // x);
        // System.out.println("Floor = " + result[0] + ", Ceil = " + result[1]);
    }

}
