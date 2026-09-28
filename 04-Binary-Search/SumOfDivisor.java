import java.util.Arrays;

public class SumOfDivisor {


    private static void printArray(int [] nums) {
        for (int i : nums) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    private static int getDivisorSum(int nums[], int divisor) {
        int sum = Arrays.stream(nums).map(x -> (int) Math.ceil((double) x / (double) divisor)).sum();

        return sum;
    }

    public int smallestDivisor(int[] nums, int limit) {
        int low = 1; 
        int max = Arrays.stream(nums).max().getAsInt();
        int high = max;

        if (nums.length > limit) return -1;

        while (high >= low) {
            int mid  = (low + high) / 2;
            int target = getDivisorSum(nums, mid);

            
            if (target <= limit) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {955557,643490};
        int limit = 814645;
        int result = solution.smallestDivisor(nums, limit);
        System.out.println("Smallest Divisor: " + result);
    }

}