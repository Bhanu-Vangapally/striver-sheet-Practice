class Solution {
    public int countNonRepeated(int arr[]) {
        //  code hereint 
        if(arr.length<=0) return 0;
        int c=0;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i:arr) mp.put(i,mp.getOrDefault(i,0)+1);
        for(Map.Entry<Integer,Integer>e:mp.entrySet()){
            if(e.getValue()==1) c++;
        }
        return c;
    }
}