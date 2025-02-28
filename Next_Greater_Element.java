class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(n, -1)); // Initialize with -1
        Stack<Integer> stack = new Stack<>();

        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements from stack while they are smaller than current element
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If stack is not empty, the top is the next greater element
            if (!stack.isEmpty()) {
                result.set(i, stack.peek());
            }

            // Push the current element onto the stack
            stack.push(arr[i]);
        }
        return result;
    }
}