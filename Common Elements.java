// User function Template for Java

class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        // Your code here
        ArrayList<Integer> l=new ArrayList<Integer>();
        Map<Integer,Integer> tm1=new TreeMap<>();
        Map<Integer,Integer> tm2=new TreeMap<>();
        for(int i:a) tm1.put(i,tm1.getOrDefault(i,0)+1);
        for(int i:b){
            if(tm1.containsKey(i)&& tm1.get(i)>0){
                l.add(i);
                tm1.put(i,tm1.get(i)-1);
            }
        }
        Collections.sort(l);
        return l;
    }
}