class Solution {
    public ArrayList<Integer> frequencyCount(int[] arr) {
        // code here
        ArrayList<Integer> l=new ArrayList<Integer>();
        Map<Integer,Integer> mp=new LinkedHashMap<>();
        for(int i:arr) mp.put(i,mp.getOrDefault(i,0)+1);
        for(Map.Entry<Integer,Integer> i:mp.entrySet())  l.add(i.getValue());
        return l;
    }
}