// User function Template for Java
class GetMin {
  static Deque<Integer> mn;
    public static Stack<Integer> _push(int arr[]) {
        // your code here
        Stack<Integer> sk=new Stack<Integer>();
        mn=new ArrayDeque<Integer>();
        // Arrays.sort(arr);
        for(int i:arr){
            sk.push(i);
            if (mn.isEmpty()) mn.push(i);
            else{ 
                mn.push(Math.min(i,mn.peek()));
            }
        }
        return sk;  
    }
    // Function to print minimum value in stack each time while popping.
    static void _getMinAtPop(Stack<Integer> s) {
        while(!s.isEmpty()){
            System.out.print(mn.pop()+" ");
                s.pop();
        }
    }
}