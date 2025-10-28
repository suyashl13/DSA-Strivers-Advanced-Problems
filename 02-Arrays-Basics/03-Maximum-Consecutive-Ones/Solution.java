public class Solution {
   public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveCount = 0;
        int lastElement = nums[0];
        int currentConsecutiveCount = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            if (lastElement == element && element == 1) {
                currentConsecutiveCount++;
            } else if (element == 1) {
                currentConsecutiveCount = 1;
            }


            if (currentConsecutiveCount > maxConsecutiveCount) maxConsecutiveCount = currentConsecutiveCount;
            lastElement = element;
        }

        return maxConsecutiveCount;
    }
    
    public static void main(String[] args) {
        int[][] testCases = {
            {1, 1, 0, 1, 1},
            {0, 1, 1, 0, 1},
            {1, 1, 1, 1, 1},
            {0, 0, 0, 0, 0},
            {1, 0, 1, 1, 0}
        };
        Solution solution = new Solution();
        for (int[] testCase : testCases) {
            int maxConsecutiveOnes = solution.findMaxConsecutiveOnes(testCase);
            System.out.println(maxConsecutiveOnes + " ");
        }
    }
}
