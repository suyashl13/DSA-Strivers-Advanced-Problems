public class Main {

    public static int[] selectionSort(int [] nums) {
        for (int i = 0; i <= (nums.length - 2); i++) {
            for (int j = i; j < nums.length; j++) {
                int assumedMin = nums[i];
                if (assumedMin > nums[j]) {
                    int temp =  nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums;
    }

    public static  int[] bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < (nums.length - 1); j++) {
                if (nums[j] > nums[j + 1]){
                    int temp =  nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        return nums;
    }

    public static int[] insertionSort(int [] nums) {

        for (int i = 0; i < nums.length; i++) {
            int j = i;
            while (j > 0 && nums[j - 1] > nums[j]) {
                int temp =  nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp;

                j--;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        System.out.println("----------- Sorting ---------");
        
        int [] nums = {44,32,13,21,532,62};

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
    }
}