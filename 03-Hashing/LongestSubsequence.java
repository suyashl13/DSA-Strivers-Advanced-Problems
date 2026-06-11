import java.util.HashSet;

public class LongestSubsequence {

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;

        for (Integer integer : nums) 
            set.add(integer);


        for (int element : nums) {
            if (set.contains(element - 1)) continue;                

            int seq = 1;
            int temp = element + 1;

            while (set.contains(temp)) {
                seq += 1;                    
                temp += 1;
            }
            
            max = Math.max(max, seq);
        }
        
        return max == Integer.MIN_VALUE ? 0 : max;
    }
}