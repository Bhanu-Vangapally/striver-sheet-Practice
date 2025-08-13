// Helper class Geeks to implement
// insert() and findFrequency()
class Geeks {

    // Function to insert element into the queue
    static void insert(PriorityQueue<Integer> q, int k) {

        // Your code here
        q.offer(k);
        // Just insert k in q and don't return anything
    }

    // Function to find an element k
    static boolean find(PriorityQueue<Integer> q, int k) {

        for(int i:q) if(i==k) return true;
        return false;
        // Your code here
        // If k is in q return true else return false
    }

    // Function to delete the max element from queue
    static int delete(PriorityQueue<Integer> q) {
        
        if(q.isEmpty()==true) return -1;
        PriorityQueue<Integer> pq=new PriorityQueue<Integer> (Collections.reverseOrder());
        pq.addAll(q);
        int mx=pq.remove();
        q.remove(mx);
        return mx;
        // Your code here
        // Delete the max element from q. The priority queue property might be useful
        // here
    }
}