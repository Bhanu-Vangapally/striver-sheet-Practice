// User function Template for Java
class Solution {
    public static int minimumVerticalSum(ArrayList<ArrayList<Integer>> arr) {
        // Your code here
        List<Integer> m=new ArrayList<Integer>();
        int mn=Integer.MAX_VALUE;
        for(List<Integer> l:arr){
            for(int j=0;j<l.size();j++){
                int val=l.get(j);
                if(m.size()<=j) m.add(val);
                else m.set(j,m.get(j)+val);
            }
        }
        for(int i:m) if(i<mn) mn=i;
        return mn;
    }
}