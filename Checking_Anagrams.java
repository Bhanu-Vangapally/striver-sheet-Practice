class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length()) return false;
        int []c=new int[26];
        for(int i=0;i<s1.length();i++){
            char x=s1.charAt(i);
            c[x-'a']++;
            x=s2.charAt(i);
            c[x-'a']--;
        }
        for(int i:c){
            if(i!=0) return false;
        }
        return true;
    }
}