// User function Template for Java

/*
class ArrItem
{
    public int item;
    public int index;

    public ArrItem(int item,int index)
    {
        this.item=item;
        this.index=index;
    }
}
*/
class mycmp implements Comparator<ArrItem>{
    public int compare(ArrItem x1, ArrItem x2){
        return x1.item-x2.item;
    }
}
class Sorting {
    public ArrayList<ArrItem> sortedWithIndices(int arr[]) {
        // Your code here
        
        // Create an array of ArrItem objects and sort by item field
        ArrayList<ArrItem> l=new ArrayList<ArrItem>();
        for(int i=0;i<arr.length;i++){
            l.add(new ArrItem(arr[i],i));
        }
        Collections.sort(l,new mycmp());
        return l;
    }
}