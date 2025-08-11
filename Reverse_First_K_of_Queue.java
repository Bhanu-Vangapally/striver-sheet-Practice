class GfG {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // code here.
        Queue<Integer> a=new LinkedList<Integer>();
        if(k<=0 ) return q;
        Deque<Integer> s=new ArrayDeque<Integer>();
        for(int i=0;i<k;i++){
            s.push(q.poll());
        }
        while(s.isEmpty()==false){
            a.offer(s.pop());
        }
        while(q.isEmpty()==false){
            a.offer(q.poll());
        }
        return a;
    }
}