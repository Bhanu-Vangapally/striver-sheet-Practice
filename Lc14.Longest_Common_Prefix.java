class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res="";
        int n=strs.length;
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[n-1];
        int mn=Math.min(first.length(),last.length());
        for(int i=0;i<mn;i++){
            if(first.charAt(i)!=last.charAt(i)) return res;
            res+=first.charAt(i);
        }
        return res;
    }
}