package Array_2D;

public class Matrix {
    //Add 2 matrices
    public static int[][] add(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int rowsB = b.length;
        int colsB = b[0].length;

        if (rowsA != rowsB || colsA != colsB) throw new IllegalArgumentException("Cannot add matrix with different sizes");

        int[][] result = new int[rowsA][colsA];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        return result;
    }

    //Subtract 2 matrices
    public static int[][] subtract(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int rowsB = b.length;
        int colsB = b[0].length;

        if (rowsA != rowsB || colsA != colsB) throw new IllegalArgumentException("Cannot subtract matrix with different sizes");

        int[][] result = new int[rowsA][colsA];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    //Multiply 2 matrices
    public static int[][] multiply(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int rowsB = b.length;
        int colsB = b[0].length;

        if (colsA != rowsB) throw new IllegalArgumentException("Cannot multiply matrix with different sizes");

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                int sum = 0;
                for (int k = 0; k < colsA; k++) {
                    sum += a[i][k] * b[k][j];
                }
                result[i][j] = sum;
            }
        }

        return result;
    }

    //Transpose a matrix
    public static int[][] transpose(int[][] a) {
        int rows = a.length;
        int cols = a[0].length;

        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = a[i][j];
            }
        }

        return result;
    }


    //Test cases
    static void main(String[] args) {
        int[][] matrixA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrixB = {
                {3, 2, 1},
                {6, 5, 4},
                {9, 8, 7}
        };

        int[][] matrixC = {
                {1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3}
        };

//        int[][] c = add(matrixA, matrixB);
//        int[][] c = subtract(matrixA, matrixB);
//        int[][] c = multiply(matrixB, matrixC);
        int[][] c = transpose(matrixC);

        System.out.println();

        for (int[] row : c) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
