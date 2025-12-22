class Solution {
    public int[][] transpose(int[][] matrix) {

        int row = matrix.length;
        int coll = matrix[0].length;

        int[][] ans = new int[coll][row];

        for (int i = 0; i <row; i++) {

            for (int j = 0;j<coll;j++) {

                ans[j][i] = matrix[i][j];

            }

        }

        return ans;
    }
}