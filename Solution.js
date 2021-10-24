
/**
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
var searchMatrix = function (matrix, target) {

    //Search rows.
    let up = 0;
    let down = matrix.length - 1;

    while (up <= down) {
        let mid = up + Math.floor((down - up) / 2);
        if (matrix[mid][0] === target) {
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
    let left = 0;
    let right = matrix[0].length - 1;

    while (left <= right) {
        let mid = left + Math.floor((right - left) / 2);
        if (matrix[down][mid] === target) {
            return true;
        }

        if (matrix[down][mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return false;
};
