
class Solution {
    static boolean isBalanced(String s) {
        // code here
        Deque<Character> sk=new ArrayDeque<>();
        for(char i:s.toCharArray()){
            if(i=='}' || i==')' || i==']') if(sk.isEmpty()) return false;
            if(i=='{' || i=='(' || i=='[') sk.push(i);
            else if (i==')' && sk.peek()=='(') sk.pop();
            else if (i==']' && sk.peek()=='[') sk.pop();
            else if (i=='}' && sk.peek()=='{') sk.pop();
            else return false;
        }
        return sk.isEmpty();
    }
}
