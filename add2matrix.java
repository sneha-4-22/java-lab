public class add2matrix {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 15, 6},
            {7, 8, 9}
        };
        int[][] matrix2 = {
            {92, 8, 7},
            {6, 5, 4},
            {3, 12, 1}
        };
        int r = matrix1.length;
        int c = matrix1[0].length;
        int[][] result = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Matrix Sum:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
