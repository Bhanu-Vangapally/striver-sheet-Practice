// User function Template for Java
class Solution {
    public static String Sorted_Characters(String s) {
        // Your code here
        TreeSet<Character> t=new TreeSet<>();
        for(Character c:s.toCharArray()) t.add(c);
        StringBuilder ans=new StringBuilder("");
        for(Character i:t) ans.append(i);
        return ans.toString();
    }
}
