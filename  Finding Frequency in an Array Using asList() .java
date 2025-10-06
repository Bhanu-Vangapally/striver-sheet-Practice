import java.util.*; 

class GfG { 
    public static void main(String[] args) { 
        // Array of Integer type
        Integer arr[] = {10, 15, 10, 20};
        
        // Convert array to list and find frequency of 10
        int res = Collections.frequency(Arrays.asList(arr), 10);
        
        // Count the frequency of 10
        System.out.println(res); 
    } 
}