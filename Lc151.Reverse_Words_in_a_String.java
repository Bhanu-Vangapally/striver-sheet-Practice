class Solution {
    public String reverseWords(String s) {
        Stack<String> sk=new Stack<>();
        String ss="";
        int n=s.length()-1;
        for(int i=n;i>=0;i--){
            if(s.charAt(i)!=' ') ss=s.charAt(i)+ss;
            else{
                if(ss.length()>0){
                    sk.push(ss);
                    ss="";
                }
            }
        }
        if(ss.length()>0) sk.push(ss);
        ss="";
        while(!sk.isEmpty()){
            ss=(sk.pop()+" "+ss);
        }
        return ss.strip();
    }
}