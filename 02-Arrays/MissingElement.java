public class MissingElement {
    public int[] findMissingRepeatingNumbers(int[] nums) {
        int map [] = new int[nums.length + 1];
        for (int i : nums) {
            map[i] += 1;
        }

        int repeating = -1, missing = -1;

        for (int i = 0; i < map.length; i++) {
            if (map[i] == 2) {
                repeating = i;
            }

            if (map[i] == 0) {
                missing = i;
            }
        }

        return new int[] {repeating, missing};
    }

    public static void main(String[] args) {
        MissingElement solution = new MissingElement();
        
        int[] nums1 = {1, 3, 4, 2, 2};
        int[] result1 = solution.findMissingRepeatingNumbers(nums1);
        System.out.println("Test 1: " + java.util.Arrays.toString(result1));
        
        int[] nums2 = {3, 1, 3, 4, 2};
        int[] result2 = solution.findMissingRepeatingNumbers(nums2);
        System.out.println("Test 2: " + java.util.Arrays.toString(result2));
        
        int[] nums3 = {2, 2};
        int[] result3 = solution.findMissingRepeatingNumbers(nums3);
        System.out.println("Test 3: " + java.util.Arrays.toString(result3));
    }
}
