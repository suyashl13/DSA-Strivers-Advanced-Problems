class Solution {
    public void rotateArrayByOne(int[] nums) {
        int temp = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = temp;
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
            solution.rotateArrayByOne(testCase);
        }

        for (int[] testCase : testCases) {
            for (int num : testCase) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}