import java.util.*;

class Point {
    int x, y;
    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}

class MyCmp implements Comparator<Point> {
    public int compare(Point p1, Point p2)
    {
        return p1.x - p2.x;
    }
}

class GfG {
    public static void main(String[] args)
    {
        Point arr[] = { new Point(10, 20), new Point(3, 12),
                        new Point(5, 7) };

        Arrays.sort(arr, new MyCmp());

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i].x + " " + arr[i].y);
    }
}