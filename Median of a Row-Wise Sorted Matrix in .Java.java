Median of a Row-Wise Sorted Matrix in Java

comments
Given a row-wise sorted matrix, the task is to find the median of the matrix. The matrix will have an odd number of elements, and all elements are distinct.

Examples:

Input:  mat[][] = {
     {1, 10, 20},
     {15, 25, 35},
     {5, 30, 40}
}
Output:  20
Explanation: The elements in sorted order are [1, 5, 10, 15, 20, 25, 30, 35, 40]. The median is 20.

Input:  mat[][] = {
     {2, 4, 6, 8, 10},
     {1, 3, 5, 7, 9},
     {100, 200, 400, 500, 800}
}
Output: 8
Explanation: The elements in sorted order are [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 100, 200, 400, 500, 800]. The median is 8.


import java.util.Arrays;

class GfG {

    public static int findMedian(int[][] mat, int r, int c) {
        
        int min = mat[0][0], max = mat[0][c - 1];

        // Finding the overall minimum and maximum in the matrix
        for (int i = 1; i < r; i++) {
            if (mat[i][0] < min) min = mat[i][0];
            if (mat[i][c - 1] > max) max = mat[i][c - 1];
        }

        int medPos = (r * c + 1) / 2;

        while (min < max) {
         int mid = (min + max) / 2, midPos = 0;

            // Count of numbers less than or equal to mid
            for (int i = 0; i < r; i++) {
                int pos = Arrays.binarySearch(mat[i], mid) + 1;
                midPos += Math.abs(pos);
            }

            if (midPos < medPos)
                min = mid + 1;
            else
                max = mid;
        }

        return min;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {5, 10, 20, 30, 40},
            {1, 2, 3, 4, 6},
            {11, 13, 15, 17, 19}
        };

        int r = mat.length;
        int c = mat[0].length;

        System.out.println("Median is: " + findMedian(mat, r, c));
    }
}