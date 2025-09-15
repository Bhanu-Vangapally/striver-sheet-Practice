// User function Template for Java

/*
This is what the class looks like
class Point
{
    public int x;
    public int y;

    public Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

    public String toString()
    {
        return("("+this.x+","+this.y+") ");
    }
}
*/
class Solution {
    public static void coordinatesSort(Point[] arr) {
        // Your code here
        Arrays.sort(arr,(p1,p2)->(p1.x==p2.x)?(p1.y-p2.y):p1.x-p2.x);

        // Use lambda expressions to sort the array in the required way
    }
}