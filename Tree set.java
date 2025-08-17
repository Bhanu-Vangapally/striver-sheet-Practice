// User function Template for Java

// Takes ArrayList as an argument and
// inserts the elements of the ArrayList into a
// TreeSet and returns the TreeSet.
class Solution {
    public static TreeSet<Integer> insert(int arr[]) {
        // Your code here
        TreeSet<Integer> t=new TreeSet<Integer>();
        for(int i:arr) t.add(i);
        return t;
    }

    // Takes a TreeSet as an argument and prints
    // the elements of the TreeSet. The newline
    // is provided by the driver code.
    public static void display(TreeSet<Integer> s) {

        Iterator it=s.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        // Your code here
    }

    // Takes TreeSet and x as arguments and erases x
    // from the TreeSet. If erased, print "erased x"
    // else then print "not found".The newline
    // is provided by the driver code.

        
    public static void erase(TreeSet<Integer> s, int x) {
        // Your code here
        // Iterator it=s.iterator();
        if(!s.contains(x)) System.out.print("not found"+" ");
        else{ 
            System.out.print("erased "+x+" ");
            s.remove(x);
        }
        
        
    }
}