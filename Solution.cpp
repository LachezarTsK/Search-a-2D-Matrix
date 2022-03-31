
#include <vector>
using namespace std;

class Solution {
    
    size_t rows;
    size_t columns;

public:

    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        
        rows = matrix.size();
        columns = matrix[0].size();
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

private:

    int getRowFromIndexFlattenedMatrix(int index) {
        return index / columns;
    }

    int getColumnFromIndexFlattenedMatrix(int index) {
        return index % columns;
    }
};
