// User function Template for Java

class Solution {
    public static ArrayList<Integer> uniqueSorted(int arr[]) {
        // Your code here
        ArrayList<Integer> l=new ArrayList<Integer>();
        if(arr.length==0) return l;
        TreeSet<Integer> t=new TreeSet<>();
        for(int i:arr) t.add(i);
        for(int i:t) l.add(i);
        return l;
    }
}