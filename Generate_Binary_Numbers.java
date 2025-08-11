class solve {

    // Function to generate binary numbers from 1 to N using a queue.
    static ArrayList<String> generate(int n) {
        // Your code here
        ArrayList<String> l=new ArrayList<String>();
        Queue<String> q=new LinkedList<>();
        q.add("1");
        for(int i=0;i<n;i++){
            String cur=q.poll();
            l.add(cur);
            q.offer(cur+"0");
            q.offer(cur+"1");
        }
        return l;
    }
}
