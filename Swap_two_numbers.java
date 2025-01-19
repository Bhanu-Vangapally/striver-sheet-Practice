class Solution{
    static List<Integer> get(int a,int b)
    {
        // code here
        List<Integer> l=new ArrayList<>();
        int s=a+b;
        l.add(s-a);
        l.add(s-b);
        return l;
    }
}