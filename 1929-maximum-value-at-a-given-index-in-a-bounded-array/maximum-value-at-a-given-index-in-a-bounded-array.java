class Solution {

    public boolean isPossible(int val, int index, int n, int maxSum) {

        long totalSum = 0;

        // Left side
        if (val <= index) {
            totalSum += (long) val * (val + 1) / 2
                      + (index - val + 1);
        } else {
            totalSum += (long) (2 * (long) val - index) * (index + 1) / 2;
        }

        // Right side
        if (val >= n - index) {
            totalSum += (2L * val + index - n + 1) * (n - index) / 2;
        } else {
            totalSum += (long) val * (val + 1) / 2
                      + (n - index - val);
        }

        // Subtract peak because it was counted twice
        totalSum -= val;

        return totalSum <= maxSum;
    }

    public int maxValue(int n, int index, int maxSum) {

        int low = 1;
        int high = maxSum;
        int ans = 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (isPossible(mid, index, n, maxSum)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}

