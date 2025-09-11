import java.util.*;
class MyDS {

    TreeMap<Integer, String> map;

    MyDS() { map = new TreeMap<Integer, String>(); }

    void add(int price, String item)
    {
        map.put(price, item);
    }

    String find(int price)
    {
        String res = map.get(price);

        if (res == null)
            return "";
        else
            return res;
    }

    void printSorted()
    {
        for (Map.Entry<Integer, String> e :
             map.entrySet()) {
            System.out.println(e.getValue() + " "
                               + e.getKey());
        }
    }

    void printGreaterSorted(int price)
    {
        SortedMap<Integer, String> sMap
            = map.tailMap(price);

        for (Map.Entry<Integer, String> e :
             sMap.entrySet()) {
            System.out.println(e.getValue() + " "
                               + e.getKey());
        }
    }

    void printSmallerSorted(int price)
    {
        SortedMap<Integer, String> sMap
            = map.headMap(price);

        for (Map.Entry<Integer, String> e :
             sMap.entrySet()) {
            System.out.println(e.getValue() + " "
                               + e.getKey());
        }
    }
}