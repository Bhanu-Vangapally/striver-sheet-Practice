class Solution {
    public static int kthSmallest(int arr[], int k) {
        //  code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:arr) pq.add(i);
        for(int i=0;i<k-1;i++) pq.poll();
        return pq.poll();
    }
}
