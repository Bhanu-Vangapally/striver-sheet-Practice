// User function Template for Java

class Solution {
    public static String TieBreak(String arr[]) {
        // Your code here
        Map<String,Integer> tm=new HashMap<>();
        for(String i:arr) tm.put(i,tm.getOrDefault(i,0)+1);
        String winner=null;
        int mxvotes=-1;
        for(Map.Entry<String,Integer> e:tm.entrySet()){
            String cnd=e.getKey();
            int vts=e.getValue();
            if(vts>mxvotes){
                winner=cnd;
                mxvotes=vts;
            }else if(vts==mxvotes){
                if(cnd.compareTo(winner)<0){
                    winner=cnd;
                }
            }
        }
        return winner;
    }
}