public class Solution {
    public int secondLargestElement(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = largest;

        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            if (largest < currentNumber) {
                secondLargest = largest;
                largest = currentNumber;
            }
            if (currentNumber != largest && currentNumber > secondLargest) {
                secondLargest = currentNumber;
            }
        }
        
        if (secondLargest == Integer.MIN_VALUE) return -1;
        return secondLargest;
    }
    
    public static void main(String[] args) {
        int[][] testCases = {
            // {5, 2, 3, 4, 1},
            // {1, 2, 3, 4, 5},
            // {5, 4, 3, 2, 1},
            // {1, 5, 2, 4, 3},
            {3,2,1,4}
        };
        Solution solution = new Solution();
        for (int[] testCase : testCases) {
            int secondLargest = solution.secondLargestElement(testCase);
            System.out.println(secondLargest + " ");
        }
    }
}
