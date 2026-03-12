import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] mergeSort(int[] nums) {
        sort(nums, 0, nums.length - 1);
        return nums;
    }

    public void sort(int [] nums, int start, int end) {
        if (start >= end) return;
        int mid = (start + end) / 2;
        sort(nums, start, mid);
        sort(nums, mid + 1, end);
        merge(nums, start, mid, end);
    }


public void merge(int[] arr, int low, int mid, int high) {

        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {

            if (arr[left] <= arr[right]) {

                temp.add(arr[left]);

                left++;
            } else {

                temp.add(arr[right]);
                right++;
            }
        }


        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] testCases = {
            {5, 2, 3, 4, 1},
            {1, 2, 3, 4, 5},
            {5, 4, 3, 2, 1},
            {1, 5, 2, 4, 3},
            {4, 1, 2, 5, 3}
        };
        for (int[] testCase : testCases) {
            int[] sorted = solution.mergeSort(testCase);
            for (int num : sorted) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
