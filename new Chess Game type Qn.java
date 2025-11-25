

class Result {

    // Compute defeating power of a number p
    private static int defeatingPowerOf(int p) {
        int evenSum = 0, oddSum = 0;
        while (p > 0) {
            int d = p % 10;
            if ((d & 1) == 0) {   // even digit
                evenSum += d;
            } else {              // odd digit
                oddSum += d;
            }
            p /= 10;
        }
        return Math.abs(evenSum - oddSum);
    }

    public static long totalDefeatingPower(int N) {

        int maxP = 2 * N;
        int[] g = new int[maxP + 1];

        // Precompute defeating power of each possible p
        for (int p = 2; p <= maxP; p++) {
            g[p] = defeatingPowerOf(p);
        }

        long total = 0;

        // Count cells for each sum s = i + j
        for (int s = 2; s <= maxP; s++) {
            long count;

            if (s <= N + 1) {
                count = s - 1L;          // increasing region
            } else {
                count = 2L * N + 1L - s; // decreasing region
            }

            total += count * g[s];
        }

        return total; // RETURN RESULT
    }
}
