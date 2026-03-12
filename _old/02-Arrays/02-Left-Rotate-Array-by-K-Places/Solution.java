import java.util.Arrays;

class Solution {
    public void rotateArray(int[] nums, int k) {
        if (nums.length == k) {
            return;
        }
        
        int [] extendedArray = new int[nums.length + k];
        int rotations = k % nums.length;
        
        int[] result = new int[nums.length * 2];

        System.arraycopy(nums, 0, result, 0, nums.length);
        System.arraycopy(nums, 0, result, nums.length, nums.length);
        System.arraycopy(result, rotations, nums, 0, nums.length);
    }

    public static void main(String[] args) {
        int[][] testCases = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20, 21, 22, 23, 24, 25}
        };
        for (int[] testCase : testCases) {
            Solution s = new Solution();
            s.rotateArray(testCase, testCase.length + 1);
            System.out.print("[");
            for (int num : testCase) {
                System.out.print(num + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}