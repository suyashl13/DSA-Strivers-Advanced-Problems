class SearchInARotatedSortedArrayII {

  public boolean searchInARotatedSortedArrayII(int[] nums, int k) {
    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
        int mid = left + (left + right) / 2;

        if (nums[mid] == k) return true;
        
        if (nums[mid] == nums[left] && nums[mid] == nums[right]) {
            left +=1;
            right-=1;
            continue;
        }

        if (nums[left] <= nums[mid]) {
            if (nums[left] <= k && k <= nums[mid]) {
                right = mid - 1;
            } else left = mid + 1;
        } else {
            if (nums[right] >= k && k >= nums[mid]) {
                left = mid + 1;
            } else right = mid - 1;
        }

    }

    return false;
  }
}
