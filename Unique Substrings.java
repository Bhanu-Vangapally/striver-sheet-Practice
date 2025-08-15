// User function Template for Java

class Solution {
    public static int unique_substring(String s) {
        // Your code here
        Set<String> t=new HashSet<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                t.add(s.substring(i,j));
            }
        }
        return t.size();
    }
}