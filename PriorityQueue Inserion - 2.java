// User function Template for Java
class Solution {
    public static PriorityQueue<Integer> insertion(ArrayList<Integer> arr) {
        // Your code here
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        Iterator it=arr.iterator();
        while(it.hasNext()){
            pq.offer((int)it.next());
        }
        return pq;
    }
}