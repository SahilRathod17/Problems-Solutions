import java.util.Arrays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] A = {{1,3},{4,2}};
        int[][] B = {{3,4},{1,2}};
        int[][] C = new int[2][2];

        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <2 ; j++) {
              C[i][j]=0;
                for (int k = 0; k <2 ; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + " ");
            }
        }

        //Using strassens matrix multiplication

        C[0][0] = A[0][0] * B[0][0] + A[0][1] * B[1][0];
        C[0][1] = A[0][0] * B[0][1] + A[0][1] * B[1][1];
        C[1][0] = A[0][0] * B[0][0] + A[1][0] * B[1][0];
        C[1][1] = A[0][0] * B[0][1] + A[1][0] * B[1][1];
        for (int i = 0; i <2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + " ");
            }
        }
    }
}
