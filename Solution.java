
public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {

        int row = searchRows(matrix, target);
        if (row < 0) {
            return false;
        }
        int column = searchColums(matrix, target, row);
        return column >= 0;
    }

    public int searchRows(int[][] matrix, int target) {
        int up = 0;
        int down = matrix.length - 1;

        while (up <= down) {
            int mid = up + (down - up) / 2;
            if (matrix[mid][0] == target) {
                return mid;
            }

            if (matrix[mid][0] < target) {
                up = mid + 1;
            } else {
                down = mid - 1;
            }
        }
        return down;
    }

    public int searchColums(int[][] matrix, int target, int row) {
        int left = 0;
        int right = matrix[0].length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (matrix[row][mid] == target) {
                return mid;
            }

            if (matrix[row][mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
