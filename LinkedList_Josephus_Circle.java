// User function Template for Java
class Solution {
    public static int josephus(int n, int k) {
        // Your code here
        LinkedList<Integer> l=new LinkedList<>();
        for(int i=0;i<n;i++){
            l.add(i);
        }
        Iterator<Integer> It=l.iterator();
        while(l.size()>1){
            int c=0;
            while(c<k){
                while(It.hasNext() && c<k){
                It.next();
                c++;
            }
            if(c<k){
                It=l.iterator();
                It.next();
                c++;
            }
            }
            It.remove();
        }
        return l.getFirst();
        
    }
}