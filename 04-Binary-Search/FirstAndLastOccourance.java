public class FirstAndLastOccourance {

    public int[] searchRange(int[] nums, int target) {
        int [] solution = {-1, -1};
        int low   = 0;
        int high  = nums.length - 1;        

        while (low <= high) {
            int mid   = low + (high - low) / 2;

            if (nums[mid] == target) {
                solution[0] = mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        low   = 0;
        high  = nums.length - 1;        

        while (low <= high) {
            int mid   = low + (high - low) / 2;

            if (nums[mid] == target) {
                solution[1] = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        return solution;
    }

    public static void main(String[] args) {
        int [] testCase  = {5, 7, 7, 8, 8, 10}; 

        System.out.print("Test Case: ");

        for (int i : testCase) {
            System.out.print(i + ", ");
        }

        int sol [] = new FirstAndLastOccourance().searchRange(testCase, 8);

        System.out.println("Solution: " + sol[0] + ", " + sol[1]);
    }

}