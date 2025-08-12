class Solution {
    static ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        ArrayList<Integer>l=new ArrayList<Integer>();
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()]) dq.removeLast();
            dq.addLast(i);
        }
        l.add(arr[dq.peek()]);
        for(int i=k;i<arr.length;i++){
            while(!dq.isEmpty() && dq.peek()<=i-k) dq.removeFirst();
            while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()]) dq.removeLast();
            dq.addLast(i);
          l.add(arr[dq.peek()]);
        }
        return l;
    }
}