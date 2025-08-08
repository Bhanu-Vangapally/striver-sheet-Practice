// User function Template for Java
class Solution {

    public static ArrayList<Integer> maxNeighbour(ArrayList<Integer> arr) {
        // Your code here
        ArrayList<Integer> l=new ArrayList<Integer>();
        for(int i=0;i<arr.size()-1;i++){
            int mx=-1;
            if(arr.get(i)>=arr.get(i+1)) mx=arr.get(i);
            else mx=arr.get(i+1);
            l.add(mx);
        }
        return l;
    }
}