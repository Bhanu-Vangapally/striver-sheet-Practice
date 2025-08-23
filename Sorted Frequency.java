//Back-end complete function Template for Java

class Solution {
    public static void freqSorted(int arr[]) {
        // Your Code Here
        Map<Integer,Integer> tm=new TreeMap<>();
        for(int i:arr) tm.put(i,tm.getOrDefault(i,0)+1);
        for(Map.Entry<Integer,Integer> e: tm.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}