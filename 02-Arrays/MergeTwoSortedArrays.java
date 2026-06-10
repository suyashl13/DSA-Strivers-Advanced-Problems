public class MergeTwoSortedArrays {

    private void swap(int [] arr1, int [] arr2, int x, int y) {
        if (arr1[x] > arr2[y]) {
            int temp = arr1[x];
            arr1[x]  = arr2[y];
            arr2[y]  = temp;
        }
    }

    

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int gap = (m + n / 2) + ((m + n) % 2);

        while (gap > 0) {
            int left  = 0;
            int right = left + gap;

            while (right < (m + n)) {
                System.out.println("left: " + left + ", right: " + right + ", gap: " + gap);
                // arr1 and arr2
                if (left < m && right >= m) {
                    swap(nums1, nums2, left,  right - m);
                } 
                // arr2
                else if (left >= m) {
                    swap(nums2, nums2, left - m, right - m);
                } else {
                    swap(nums1, nums1, left, right);
                }

                left+=1;
                right+=1;
            }

            if (gap == 1) break;
            gap = (gap / 2) + (gap % 2);
        }
        
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[i - m];
        }
    }

    public static void main(String[] args) {
        MergeTwoSortedArrays merger = new MergeTwoSortedArrays();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;

        merger.merge(nums1, m, nums2, n);

        System.out.print("Merged array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
