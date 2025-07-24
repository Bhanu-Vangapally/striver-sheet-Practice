import java.util.*;

class GFG {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(5, 10, 20, 30, 8, 7);
        
        l.stream()
         .filter(x -> x % 2 == 0)   
         .forEach(System.out::println);
    }
}