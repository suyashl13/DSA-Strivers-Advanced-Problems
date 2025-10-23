class Solution {
    public int[] insertionSort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int j = i;
            while (j > 0 && nums[j - 1] > nums[j]) {
                int temp = nums[j - 1];
                nums[j - 1] = nums[j];
                nums[j] = temp;

                j--;
            }
        }

        return nums;
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
            int[] sorted = solution.insertionSort(testCase);
            for (int num : sorted) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}