class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) return false;

        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0; i < m; i++) {
            int l = 0;
            int r = n - 1;
            while(l <= r) {
                int mid = (l + r) / 2;
                if(matrix[i][mid] == target) return true;
                else if(matrix[i][mid] < target) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }

        return false;
    }
}
