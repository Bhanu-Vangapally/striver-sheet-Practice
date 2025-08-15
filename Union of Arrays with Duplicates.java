class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        Set<Integer> s=new HashSet<>();
        Set<Integer> s1=new HashSet<>();
        for(int i:a) s.add(i);
        for(int i:b) s1.add(i);
        ArrayList<Integer> l=new ArrayList<Integer>();
        s.addAll(s1);
        for(int i:s) l.add(i); 
        return l;
    }
}