class Solution {
    // Function to return kth largest element from an array.
    public static int KthLargest(int arr[], int k) {
        // Your code here
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
        pq.add(arr[i]);
        }
        for(int i=0;i<k-1;i++){
                pq.poll();
        }
        return pq.poll();
    }
}