import java.util.*;

class GfG {
    static void printKMostFreq(int arr[], int k) {
        int n = arr.length;

        // Step 1: Count frequency using HashMap
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
        }

        // Step 2: Create frequency bucket (List of Lists)
        List<List<Integer>> freq = new ArrayList<List<Integer>>();
        for (int i = 0; i <= n; i++) {
            freq.add(new ArrayList<Integer>());
        }

        // Step 3: Populate bucket with elements at their frequency index
        for (Map.Entry<Integer, Integer> x : m.entrySet()) {
            freq.get(x.getValue()).add(x.getKey());
        }

        // Step 4: Collect top K frequent elements from bucket
        int count = 0;
        for (int i = n; i > 0; i--) {
            for (int num : freq.get(i)) {
                System.out.print(num + " ");
                count++;
                if (count == k) return;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 5, 20, 5, 10, 10, 30};
        int k = 2;
        printKMostFreq(arr, k);
    }
}