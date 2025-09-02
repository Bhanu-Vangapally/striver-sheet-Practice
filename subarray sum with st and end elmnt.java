import java.util.*;

class Solution {
    public int maximumSum(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] prefix = new int[n];
        prefix[0] = arr.get(0);

        // Step 1: Build prefix sum
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr.get(i);
        }

        // Step 2: Store first occurrence of each element
        Map<Integer, Integer> firstIndex = new HashMap<>();
        int maxSum = 0;

        for (int i = 0; i < n; i++) {
            int val = arr.get(i);

            // Case 1: Single element subarray
            maxSum = Math.max(maxSum, val);

            // Case 2: Subarray between two same values
            if (firstIndex.containsKey(val)) {
                int j = firstIndex.get(val);
                int subSum = prefix[i] - (j > 0 ? prefix[j - 1] : 0);
                maxSum = Math.max(maxSum, subSum);
            } else {
                firstIndex.put(val, i); // store first occurrence
            }
        }

        return maxSum;
    }

    // For testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(4, 3, 1, 2, 4, 2, 5, 3, 6));
        System.out.println(sol.maximumSum(arr1)); // Output: 20

        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 2));
        System.out.println(sol.maximumSum(arr2)); // Output: 2
    }
}
