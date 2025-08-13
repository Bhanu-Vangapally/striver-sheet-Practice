// User function Template for Java

class Solution {
    public static int max_toys(int arr[], int k) {
        // Your code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:arr) pq.add(i);
        int s=0,c=0;
        for(int i:pq){
            s+=i;
            if(s<=k) c++;
        }
        return c;
    }
}