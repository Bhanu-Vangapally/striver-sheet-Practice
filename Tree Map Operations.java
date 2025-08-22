/*You are required to complete below methods */
class GfG {
    /*Inserts an entry with key x and value y in map */
    void add_Value(TreeMap<Integer, Integer> hm, int x, int y) {
        // Your code here
        hm.put(x,y);
    }

    /*Returns the value with key x from the map */
    int find_value(TreeMap<Integer, Integer> hm, int x) {
        if(hm.containsKey(x)) return hm.get(x);
        // Your code here
        return -1;
    }

    /*Returns the size of the map */
        
    int getSize(TreeMap<Integer, Integer> hm) {
        // Your code here
        return hm.size();
    }

        
    /*Removes the entry with key x from the map */
    void removeKey(TreeMap<Integer, Integer> hm, int x) {
        // Your code here
        hm.remove(x);
    }
        

    /*print map sorted by key */
    void sorted_By_Key(TreeMap<Integer, Integer> hm) {
        // Your code here
        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            System.out.print(e.getKey()+" ");
        }
    }
}