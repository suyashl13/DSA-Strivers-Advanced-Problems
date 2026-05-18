public class SortArrayorOneAndZero {

    void swap(int nums[], int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    public void sortZeroOneTwo(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            int midElement = nums[mid];
            
            if (midElement == 0) {
                swap(nums, mid, low);
                mid+=1;
                low+=1;
            } else if (midElement == 1) {
                mid += 1;
            } else if (midElement == 2) {
                swap(nums, mid, high);
                high-=1;
            }
        }

    }

    public static void main(String[] args) {
        SortArrayorOneAndZero sorter = new SortArrayorOneAndZero();
        int[] nums = {2, 0, 1, 2, 0, 1, 1, 0};

        System.out.print("Before: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        sorter.sortZeroOneTwo(nums);

        System.out.print("After:  ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
