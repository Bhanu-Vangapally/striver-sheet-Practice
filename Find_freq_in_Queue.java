class Geeks {
    static void enqueue(Queue<Integer> q, int k) {
        //  code here
        q.offer(k);
    }

    static int findFrequency(Queue<Integer> q, int k) {
        int c=0;
        for(int i=0;i<q.size();i++){
            int x=q.poll();
            if(k==x) c++;
        q.offer(x);
        }
        return c;
        
        //  code here
    }
}