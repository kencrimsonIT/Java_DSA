package Recusrion;

public class PascalTriangle {
    //Display the triangle
    public static void printPascalTriangle(int rows) {
        for (int i = 0; i <= rows - 1; i++) {
            for (int s = 0; s < rows - 1 - i; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(pascalTriangle(i, j) + " ");
            }
            System.out.println();
        }
    }

    private static int pascalTriangle(int rows, int cols) {
        if (cols == 0 || cols == rows) {
            return 1;
        } else {
            return pascalTriangle(rows - 1, cols - 1) + pascalTriangle(rows - 1, cols);
        }
    }

    //Display the triangle following n rows
    public static int[] getPascalTriangle(int n) {
        if (n == 1) return new int[]{1};
        else if (n == 2) return new int[]{1, 1};
        return generateNextRow(getPascalTriangle(n - 1));
    }

    //Generate the next row based on the previous row
    public static int[] generateNextRow(int[] prevRows) {
        int[] nextRows = new int[prevRows.length + 1];
        prevRows[0] = 1; prevRows[prevRows.length - 1] = 1;

        for (int i = 1; i < nextRows.length - 1; i++) {
            nextRows[i] = prevRows[i - 1] + prevRows[i];
        }

        return nextRows;
    }

    static void main(String[] args) {
        int rows = 4;
        printPascalTriangle(rows);
//        System.out.print(getPascalTriangle(rows));
    }
}
