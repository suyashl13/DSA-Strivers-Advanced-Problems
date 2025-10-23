class Solution {
    public int[] selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[minIndex] > nums[j]) minIndex = j;
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[][] testCases = {
            {5, 2, 8, 12, 3},
            {10, 9, 8, 7, 6, 5, 4, 3, 2, 1},
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
        };
        for (int[] testCase : testCases) {
            int[] result = new Solution().selectionSort(testCase);
            System.out.print("[");
            for (int num : result) {
                System.out.print(num + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}