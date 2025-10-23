class Solution {
    public void rotateArrayByOne(int[] nums) {
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = temp;
    }


    public static void main(String[] args) {
        int[][] testCases = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };
        for (int[] testCase : testCases) {
            Solution s = new Solution();
            s.rotateArrayByOne(testCase);
            System.out.print("[");
            for (int num : testCase) {
                System.out.print(num + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}