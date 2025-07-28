
class Solution {
    // Function to remove consecutive duplicates from given string using Stack.
    public static String removeConsecutiveDuplicates(String s) {
        // Your code here
        StringBuilder ans= new StringBuilder("");
        Stack<Character> sk=new Stack<>();
        for(char i:s.toCharArray()){
            if(sk.isEmpty()) sk.push(i);
            else{
                if(sk.peek()!=i) sk.push(i);
            }
        }
        while(!sk.isEmpty()) ans.insert(0,sk.pop());
        // System.out.print(sk);
        return ans.toString();
    }
}