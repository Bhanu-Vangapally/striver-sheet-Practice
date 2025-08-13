class Solution {
    public static int minCost(int[] arr) {
        // code here
        int s=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:arr) pq.offer(i);
        while(pq.size()!=1){
            int x=pq.poll();
            int y=pq.poll();
            int z=x+y;
            s+=z;
            pq.offer(z);
        }
        return s;
    }
}