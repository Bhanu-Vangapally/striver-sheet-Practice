// User function Template for Java

class Geeks {
    // Complete this function
    // Function to check if there is a pair with the given sum in the array.
    public static int sumExists(int arr[], int sum) {
        // Your code here, Geeks
        Set<Integer> s=new HashSet<>();
        for(int i:arr){
            if(s.contains(sum-i)) return 1;
            else s.add(i);
        }
        return 0;
    }
}