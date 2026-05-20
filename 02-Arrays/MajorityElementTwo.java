import java.util.ArrayList;
import java.util.List;

public class MajorityElementTwo {
   public List<Integer> majorityElementTwo(int[] nums) {
        // Use boxed Integers or null to safely handle arrays containing MIN_VALUE/MAX_VALUE
        Integer element1 = null, element2 = null;
        int count1 = 0, count2 = 0;

        // Pass 1: Find potential candidates
        for (int currentElement : nums) {
            if (element1 != null && currentElement == element1) {
                count1++;
            } else if (element2 != null && currentElement == element2) {
                count2++;
            } else if (count1 == 0) {
                element1 = currentElement;
                count1 = 1;
            } else if (count2 == 0) {
                element2 = currentElement;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Pass 2: Verify the candidates
        count1 = 0;
        count2 = 0;
        for (int currentElement : nums) {
            if (element1 != null && currentElement == element1) count1++;
            else if (element2 != null && currentElement == element2) count2++;
        }

        List<Integer> result = new ArrayList<>();
        int threshold = nums.length / 3;
        
        if (count1 > threshold) result.add(element1);
        if (count2 > threshold) result.add(element2);

        return result;
    }
    
    public static void main(String[] args) {
        MajorityElementTwo solver = new MajorityElementTwo();

        int[] nums1 = {1, 2, 3, 2, 2, 1, 1};
        int[] nums2 = {3, 3, 4};
        int[] nums3 = {1, 1, 1, 3, 3, 2, 2, 2};

        System.out.println("Input: [1, 2, 3, 2, 2, 1, 1] -> " + solver.majorityElementTwo(nums1));
        System.out.println("Input: [3, 3, 4] -> " + solver.majorityElementTwo(nums2));
        System.out.println("Input: [1, 1, 1, 3, 3, 2, 2, 2] -> " + solver.majorityElementTwo(nums3));
    }

}
