class Solution {
    public static String removePair(String s) {
        // code here
        Deque<Character> sk=new ArrayDeque<>();
        StringBuilder ans=new StringBuilder();
        for(char i:s.toCharArray()){ 
            if(!sk.isEmpty() && i==sk.peek()) sk.pop();
            else sk.push(i);
        }
        while(!sk.isEmpty()){
            ans.insert(0,sk.pop());
        }
        return ans.toString();
    }
}