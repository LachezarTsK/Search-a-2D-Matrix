
public class Solution {

    int rows;
    int columns;

    public boolean searchMatrix(int[][] matrix, int target) {

        rows = matrix.length;
        columns = matrix[0].length;
        int left = 0;
        int right = rows * columns - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;
            int row = getRowFromIndexFlattenedMatrix(mid);
            int column = getColumnFromIndexFlattenedMatrix(mid);

            if (matrix[row][column] == target) {
                return true;
            }

            if (matrix[row][column] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    private int getRowFromIndexFlattenedMatrix(int index) {
        return index / columns;
    }

    private int getColumnFromIndexFlattenedMatrix(int index) {
        return index % columns;
    }
}
