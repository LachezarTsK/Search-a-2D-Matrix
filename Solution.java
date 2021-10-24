
public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {

        //Search rows.
        int up = 0;
        int down = matrix.length - 1;

        while (up <= down) {
            int mid = up + (down - up) / 2;
            if (matrix[mid][0] == target) {
                return true;
            }

            if (matrix[mid][0] < target) {
                up = mid + 1;
            } else {
                down = mid - 1;
            }
        }

        if (down < 0) {
            return false;
        }

        //Search columns.
        int left = 0;
        int right = matrix[0].length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (matrix[down][mid] == target) {
                return true;
            }

            if (matrix[down][mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}
