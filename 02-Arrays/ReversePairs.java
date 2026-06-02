import java.util.ArrayList;
import java.util.List;

public class ReversePairs {

    public long mergeSort(int[] nums, int start, int end) {
        long count = 0;
        if (start < end) {
            int mid = (start + end) / 2;
            count += mergeSort(nums, start, mid);
            count += mergeSort(nums, mid + 1, end);

            count += sort(nums, start, mid, end);
        }
        return count;
    }

    public long sort(int[] nums, int start, int mid, int end) {
        List<Integer> temp = new ArrayList<>();
        int left = start;
        int right = mid + 1;
        long count = 0;

        while (left <= mid && right <= end) {
            if (nums[left] <= nums[right]) {
                temp.add(nums[left]);
                left += 1;
            } else {
                temp.add(nums[right]);
                right += 1;

                if (nums[left] > nums[right] * 2) {
                    count += (mid - left) + 1;
                }
                
            }
        }

        while (left <= mid) {
            temp.add(nums[left]);
            left += 1;
        }

        while (right <= end) {
            temp.add(nums[right]);
            right += 1;
        }

        for (int i = start; i <= end; i++) {
            nums[i] = temp.get(i - start);
        }

        return count;
    }

    public int reversePairs(int[] nums) {
        return (int) mergeSort(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        System.out.println(new ReversePairs().reversePairs(new int[] { 6, 4, 1, 2, 7 }));
    }
}
