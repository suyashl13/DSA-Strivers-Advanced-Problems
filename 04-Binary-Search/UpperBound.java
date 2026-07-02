class UpperBound {
    public int search(int[] nums, int target) {
        
        int low = 0;
        int high = nums.length - 1;
        int answer = nums.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target == nums[mid]) {
                return mid;
            }
            
            if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
                answer = mid;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        UpperBound bs = new UpperBound();
        int[] nums = {1, 3, 5, 7, 9, 11};

        System.out.println("search 7 -> index: " + bs.search(nums, 7));
        System.out.println();
        System.out.println("search 4 -> index: " + bs.search(nums, 4));
        System.out.println("search 1 -> index: " + bs.search(nums, 1));
        System.out.println("search 11 -> index: " + bs.search(nums, 11));
    }
}