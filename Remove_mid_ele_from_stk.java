// User function Template for Java

class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        // code here
        ArrayList<Integer> l=new ArrayList<>();
        while(!s.isEmpty()){
            l.add(s.pop());
        }
    
        l.remove(l.size()/2);
        for(int i=l.size()-1;i>=0;i--){
            s.push(l.get(i));
        }
    }
}
