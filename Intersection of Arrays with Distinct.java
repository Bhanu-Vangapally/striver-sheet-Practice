class Solution {
    public static int intersectSize(int a[], int b[]) {
        // Your code here
        Set<Integer> s=new HashSet<>();
        Set<Integer> s1=new HashSet<>();
        for(int i:a) s.add(i);
        for(int i:b) s1.add(i);
        s.retainAll(s1);
        return s.size();
    }
}