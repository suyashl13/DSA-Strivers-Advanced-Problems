import java.util.Arrays;

class RoseGarden {

    private static boolean isPossible(int[] bouquet, int requiredAdjecentRosesForBouquet, int requiredBouquet, int days) {
        // Pass
        int consectiveFlowers = 0;
        int createdBouquets = 0;

        for (int i = 0; i < bouquet.length; i++) {
            int currentElement = bouquet[i];

            if (currentElement <= days) {
                consectiveFlowers += 1;
            } else {
                createdBouquets += (consectiveFlowers / requiredAdjecentRosesForBouquet);
                consectiveFlowers = 0;
            }
        }

        createdBouquets += (consectiveFlowers / requiredAdjecentRosesForBouquet);
        return createdBouquets >= requiredBouquet;
    }

    public int roseGarden(int n, int[] bouquet, int requiredAdjecentRosesForBouquet, int requiredBouquet) {
        
        if (requiredAdjecentRosesForBouquet * requiredBouquet > n) return -1;

        int low = Arrays.stream(bouquet).min().getAsInt();
        int high = Arrays.stream(bouquet).max().getAsInt();
        int answer = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(bouquet, requiredAdjecentRosesForBouquet, requiredBouquet, mid)) {
                answer = mid;

                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return answer;

    }
}
