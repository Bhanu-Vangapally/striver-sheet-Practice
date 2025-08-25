import java.util.*;

class GFG {
    public static void main(String args[])
    {
        TreeMap<Integer, String> map
            = new TreeMap<Integer, String>();

        map.put(10, "geeks");
        map.put(15, "ide");
        map.put(5, "courses");

        System.out.println(map.higherKey(10));

        System.out.println(map.lowerKey(10));

        System.out.println(map.floorKey(10));

        System.out.println(map.ceilingKey(10));

	System.out.println(map.higherEntry(10).getValue());

        System.out.println(map.lowerEntry(10).getValue());

        System.out.println(map.floorEntry(10).getValue());

        System.out.println(map.ceilingEntry(10).getValue());
    }
}