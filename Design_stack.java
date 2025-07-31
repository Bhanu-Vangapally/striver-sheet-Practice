class Solution {
    
    public static Stack<Integer> push(int arr[]) {
        // Your code here
        Stack<Integer> sk=new Stack<Integer>();
        for(int i:arr){
            sk.push(i);
        }
        return sk;
    }

    public static void pop(Stack<Integer> s) {

        while(!s.isEmpty())
            System.out.print(s.pop()+" ");
        
    }
}