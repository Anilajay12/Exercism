import java.util.Arrays;
class Matrix {
    private int[][] a;

    Matrix(String matrixAsString) {
        String[] rows = matrixAsString.split("\\n+");
        int ncols = rows[0].split("\\s+").length;
        a = new int[rows.length][ncols];

        for (int i = 0; i < rows.length; i++) {
            String[] row = rows[i].split("\\s+");
            for (int j = 0; j < row.length; j++)
                a[i][j] = Integer.parseInt(row[j]);
        }
    }

    int[] getRow(int rowNumber) {
        return a[rowNumber-1];
    }

    int[] getColumn(int columnNumber) {
        int[] col = new int[a.length];
        for (int i = 0; i < a.length; i++)
            col[i] = a[i][columnNumber-1];
        return col;
    }
}