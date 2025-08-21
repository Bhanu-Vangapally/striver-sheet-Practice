class Solution {
    public static int firstRepeated(int[] arr) {
        // code here
        Map<Integer,Integer> lhm=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++) lhm.put(arr[i],lhm.getOrDefault(arr[i],0)+1);
        int mn=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) if(lhm.get(arr[i])>=2) mn=Math.min(i,mn);
        return mn==Integer.MAX_VALUE?-1:mn+1;
    }
}
