class Day4{
    public int[][] modifiedMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] maxValues = new int[n];
        Arrays.fill(maxValues, Integer.MIN_VALUE);
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                if (matrix[i][j] > maxValues[j]) {
                    maxValues[j] = matrix[i][j];
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = maxValues[j];
                }
            }
        }
        return matrix;
    }
}