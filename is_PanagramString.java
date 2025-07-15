// User function Template for Java

class Solution {

    // Complete the function
    // str: input string
    public static boolean isPanagram(String str) {
        // Check if given string is panagram
        if(str.length()<26) return false;
        boolean c[]=new boolean[26];
        for(char i:str.toCharArray()){
            if(i>='a' && i<='z')    c[i-'a']=true;
            if(i>='A' && i<='Z')    c[i-'A']=true;
        }
        for(boolean i:c) if(i!=true) return false;
        return true;
    }
}