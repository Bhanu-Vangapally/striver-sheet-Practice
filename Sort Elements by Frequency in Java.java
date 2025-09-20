import java.util.*;

class MyCmp
    implements Comparator<Map.Entry<Integer, Integer> > {
    public int compare(Map.Entry<Integer, Integer> m1,
                       Map.Entry<Integer, Integer> m2)
    {
        if (m1.getValue() == m2.getValue()) {
            return m1.getKey() - m2.getKey();
        }
        else {
            return m2.getValue() - m1.getValue();
        }
    }
}
class GfG {

    static void sortByFreq(int arr[])
    {
        Map<Integer, Integer> m = new HashMap<>();
        for (int x : arr) {
            m.put(x, m.getOrDefault(x, 0) + 1);
        }

        List<Map.Entry<Integer, Integer> > list
            = new ArrayList<>(m.entrySet());

        Collections.sort(list, new MyCmp());

        int index = 0;
        for (Map.Entry<Integer, Integer> e : list) {
            for (int i = 0; i < e.getValue(); i++) {
                arr[index++] = e.getKey();
            }
        }
    }

    public static void main(String args[])
    {
        int arr[] = { 10, 5, 20, 10, 10, 5, 20 };
        sortByFreq(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}