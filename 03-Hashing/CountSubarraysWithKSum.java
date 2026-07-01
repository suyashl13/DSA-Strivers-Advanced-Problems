import java.util.HashMap;

public class CountSubarraysWithKSum {

    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> temp = new HashMap<>();
        int sum = 0;
        int count = 0;
        
        temp.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int target = sum - k;

            if (temp.containsKey(target)) {
                count += temp.get(target);
            }

            temp.put(sum, temp.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}