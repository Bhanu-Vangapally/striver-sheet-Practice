// User function Template for Java

class Solution {
    public static int profit(int V[]) {
        // Your code here
        Deque<Integer> s=new ArrayDeque<>();
        int n=V.length,ans=0;
        int [] p=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && V[s.peek()]<V[i]){
                s.pop();
            }
            if(!s.isEmpty()){
                p[i]=V[s.peek()]-V[i];
            }else p[i]=V[i];
            s.push(i);
        }
            for(int i:p) ans+=i;
            return ans;
    }
};