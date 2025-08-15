// User function Template for Java

class Geeks {
    // Complete this function
    // Function to check if two numbers in array have sum equal to the given
    // sum.
    public static int sumExists(int arr[], int sum) {

        // Your code here
        Set<Integer> s=new HashSet<>();
        for(int i:arr){
            if(s.contains(sum-i)) return 1;
            else s.add(i);
        }
        return 0;
    }
}