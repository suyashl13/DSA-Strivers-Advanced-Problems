import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static int[] selectionSort(int[] nums) {
        for (int i = 0; i <= (nums.length - 2); i++) {
            for (int j = i; j < nums.length; j++) {
                int assumedMin = nums[i];
                if (assumedMin > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums;
    }

    public static int[] bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < (nums.length - 1); j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        return nums;
    }

    public int[] mergeSort(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void mergeSort(int[] nums, int low, int high) {
        System.out.println("Low: " + low + " High: " + high);
        if (low >= high) {
            System.out.println("BREAK");
            return;
        }

        int mid = (low + high) / 2;

        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);

        merge(nums, low, mid, high);
    }

    public void merge(int[] arr, int low, int mid, int high) {
        // Temporary array to store merged elements
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

    public static int[] insertionSort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int j = i;
            while (j > 0 && nums[j - 1] > nums[j]) {
                int temp = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp;

                j--;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        System.out.println("----------- Sorting ---------");

        int[] nums = { 44, 32, 13, 21, 532, 62 };

        System.out.println("Selection Sort: ");
        for (int i : selectionSort(nums)) {
        System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Bubble Sort: ");
        for (int i : bubbleSort(nums)) {
        System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Insertion Sort: ");
        for (int i : insertionSort (nums)) {
        System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Merge Sort: ");
        for (int i : new Main().mergeSort(nums)) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}