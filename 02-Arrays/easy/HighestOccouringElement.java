import java.util.HashMap;
import java.util.Map.Entry;

public class HighestOccouringElement {

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int elementCount = countMap.getOrDefault(nums[i], 0);

            countMap.put(nums[i], elementCount+=1);
        }

        for (Entry<Integer, Integer> pair : countMap.entrySet()) {
            if(pair.getValue() > nums.length / 2) return pair.getKey();
        }

        return -1;
    }

    public static void main(String[] args) {
        HighestOccouringElement solution = new HighestOccouringElement();
        
        int[] nums1 = {3, 2, 3};
        System.out.println("Majority element: " + solution.majorityElement(nums1));
        
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority element: " + solution.majorityElement(nums2));
    }
}