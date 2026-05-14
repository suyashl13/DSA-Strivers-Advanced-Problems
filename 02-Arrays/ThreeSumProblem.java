import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumProblem {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> solList = new ArrayList<>();
    
        Arrays.sort(nums); 
        
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum < 0) {
                    j += 1;
                } else if (sum == 0) {
                    // FIX 2: Changed second nums[k] to nums[j] to record the correct triplet
                    solList.add(List.of(nums[i], nums[j], nums[k]));
                    
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j-1]) j++;
                    while (j < k && nums[k] == nums[k+1]) k--;
                } else {
                    k -= 1;
                }
            }
        }

        return solList;
    }
}
