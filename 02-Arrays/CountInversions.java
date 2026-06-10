import java.util.ArrayList;
import java.util.List;

public class CountInversions {

    private int mergeAndCount(int [] nums, int low, int high) {
        if (low < high) return 0;

        int mid = (low + high) / 2;

        int count = mergeAndCount(nums, low, mid);
        count += mergeAndCount(nums, mid + 1, high);

        count += countInversions(nums, low, high);
        merge(nums, low, high);

        return count;

    }

    private int countInversions(int [] nums, int low, int high) {
        int count = 0;

        int left = low;
        int mid = (low + high) / 2;
        int right = mid+1;

        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                left+=1;
            } else if (nums[left] > nums[right] ) {
                count += (mid - left + 1);
                right+=1;
            }
        }

        return count;
    }


    private void merge(int [] nums, int low, int high) {
        List<Integer> temp = new ArrayList<>();

        int left = low;
        int mid = (low + high) / 2;
        int right = mid+1;

        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp.add(nums[left]);
                left+=1;
            } else {
                temp.add(nums[right]);
                right+=1;
            }
        }

        while (left <= mid) {
            temp.add(nums[left]);
            left+=1;
        }

        while (right <= high) {
            temp.add(nums[right]);
            right+=1;
        }

        for (int i = low; i < high; i++) {
            nums[i] = temp.get(low - i);
        }

    }

    public int reversePairs(int [] nums) {
        return mergeAndCount(nums, 0, nums.length -1);
    }

    public static void main(String[] args) {
        CountInversions solution = new CountInversions();
        
        int[] nums1 = {1, 3, 2, 3, 1};
        System.out.println("Number of inversions: " + solution.reversePairs(nums1));
        
        int[] nums2 = {2, 4, 3, 5, 1};
        System.out.println("Number of inversions: " + solution.reversePairs(nums2));
    }
}
