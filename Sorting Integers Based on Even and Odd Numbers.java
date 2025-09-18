import java.util.*;

class MyCmp implements Comparator<Integer> {
    public int compare(Integer a, Integer b)
    {
        // Sorting even numbers before odd numbers
        return a % 2 - b % 2;
    }
}

class GfG {
    public static void main(String[] args)
    {
        Integer[] arr = { 5, 20, 10, 3, 12 };

        // Sorting by passing MyCmp object
        Arrays.sort(arr, new MyCmp());

        System.out.println(Arrays.toString(arr));
    }
}