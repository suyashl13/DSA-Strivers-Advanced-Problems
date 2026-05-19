import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {

    public List<Integer> leaders(int[] nums) {

        List<Integer> solution = new ArrayList<Integer>();
        Integer maxUntilNow = Integer.MIN_VALUE;

        for (int i = (nums.length - 1); i >= 0; i--) {
            int currentElement = nums[i];
            if (maxUntilNow < currentElement) {
                maxUntilNow = currentElement;
                solution.add(maxUntilNow);
            }
        }

        solution.sort((x, y)-> {
            if (x > y) {
                return 1;
            } else return -1;
        });

        return solution;
    }

    public static void main(String[] args) {
        LeadersInArray finder = new LeadersInArray();
        int[] nums = {16, 17, 4, 3, 5, 2};
        List<Integer> leaders = finder.leaders(nums);
        System.out.println(leaders);
    }
}