class MyHashSet {
    ArrayList<Integer> l;
    public MyHashSet() {
        l=new ArrayList<>();;
    }
    
    public void add(int key) {
        if(!l.contains(key)) l.add(key);
    }
    
    public void remove(int key) {
        if(l.size()==0) return;
        if(l.contains(key)) l.remove((Integer)key);
        else return;
    }
    
    public boolean contains(int key) {
        for(int i:l) if(i==key) return true;
        return false;
    }
}
//#0j
/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */