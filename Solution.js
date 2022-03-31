
/**
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
var searchMatrix = function (matrix, target) {
    this.rows = matrix.length;
    this.columns = matrix[0].length;
    let left = 0;
    let right = rows * columns - 1;

    while (left <= right) {

        let mid = left + Math.floor((right - left) / 2);
        let row = getRowFromIndexFlattenedMatrix(mid);
        let column = getColumnFromIndexFlattenedMatrix(mid);

        if (matrix[row]
        [column] === target) {
            return true;
        }

        if (matrix[row][column] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return false;
};

/**
 * @param {number} index
 * @return {number}
 */
function  getRowFromIndexFlattenedMatrix(index) {
    return Math.floor(index / this.columns);
}

/**
 * @param {number} index
 * @return {number}
 */
function getColumnFromIndexFlattenedMatrix(index) {
    return index % this.columns;
}
