import java.util.Arrays;

public class RearrangeElementBySign {

    public int[] rearrangeArray(int[] nums) {
        int [] solution = new int[nums.length];
        int positiveCurrentIndex = 0;
        int negativeCurrentIndex = 1;

        for (int i = 0; i < solution.length; i++) {
            int currentElement = nums[i];

            if (currentElement > 0) {
                solution[positiveCurrentIndex] = currentElement;
                positiveCurrentIndex+=2;
            } else {
                solution[negativeCurrentIndex] = currentElement;
                negativeCurrentIndex+=2;
            }

        }

        return solution;
    }

    public static void main(String[] args) {
        RearrangeElementBySign obj = new RearrangeElementBySign();
        int[] nums = {3, 1, -2, -5, 2, -4};
        int[] result = obj.rearrangeArray(nums);
        System.out.println(Arrays.toString(result));
    }
}