import java.util.*;

class GfG {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        Collections.fill(list, -1);
        System.out.println(list);
    }
}


import java.util.Arrays;

class GfG {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        for (int[] row : arr) {
            Arrays.fill(row, 1);
        System.out.print(Arrays.toString(row));
        }
    }
}