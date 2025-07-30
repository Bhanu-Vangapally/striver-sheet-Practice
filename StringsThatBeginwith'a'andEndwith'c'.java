import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        String arr[] = {"abc", "cde", "ac", "aec", "xy3"};
        Arrays.stream(arr)
            .filter(x -> x.startsWith("a"))
            .filter(x -> x.endsWith("c"))
            .sorted()
            .forEach(System.out::println);
    }
}