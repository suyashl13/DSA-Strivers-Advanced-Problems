public class Solution {
    public int largestElement(int[] nums) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (largest < nums[i]) largest = nums[i];
        }
        return largest;
    }
    public static void main(String[] args) {
        int[][] testCases = {
            {5, 2, 3, 4, 1},
            {1, 2, 3, 4, 5},
            {5, 4, 3, 2, 1},
            {1, 5, 2, 4, 3},
            {4, 1, 2, 5, 3}
        };
        Solution solution = new Solution();
        for (int[] testCase : testCases) {
            int largest = solution.largestElement(testCase);
            System.out.println(largest);
        }
    }    
}
