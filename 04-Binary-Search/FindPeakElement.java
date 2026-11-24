class FindPeakElement {

    private static int isPeakElement(int[] arr, int index) {
        if (arr[index] > arr[index - 1] && arr[index] > arr[index + 1]) {
            return 0;
        } else if (arr[index] < arr[index - 1]) {
            return -1;
        } else if (arr[index] < arr[index + 1]) {
            return 1;
        }

        return 2;
    }

    public int findPeakElement(int[] arr) {
        // Edge Case Check
        if (arr.length == 1) return 0;
        if (arr[0] > arr[1]) return 0;
        if (arr[arr.length - 1] > arr[arr.length - 2]) return arr.length - 1;

        int low = 1;
        int high = arr.length - 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int ans = isPeakElement(arr, mid);

            if (ans == 0) {
                return mid;
            } else if (ans == 1) {
                low = mid + 1;
            } else if (ans == -1) {
                high = mid - 1;
            }

        }

        return -1;
    }
}
