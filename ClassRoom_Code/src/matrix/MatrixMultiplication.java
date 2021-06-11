package matrix;
import java.util.Scanner;
public class MatrixMultiplication {
    public static void main(String[] args) {
        MatrixMultiplication matrixMultiplication = new MatrixMultiplication();
        matrixMultiplication.inputdata();
    }
    public void inputdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix: ");
        int size = sc.nextInt();
        int[][] matrix1 = new int[size][size];
        int[][] matrix2 = new int[size][size];
        System.out.println("Enter the data of first matrix: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the data of second matrix: ");
        for (int m = 0; m < size; m++) {
            for (int n = 0; n < size; n++) {
                matrix2[m][n] = sc.nextInt();
            }

        }
        multiplication(matrix1, matrix2, size);
    }
    public void multiplication(int[][] matrix1, int[][] matrix2, int size) {
        int[][] multiplication = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multiplication[i][j] = 0;
                for (int k = 0; k < size; k++) {
                    multiplication[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        show(multiplication, size);
    }
    public void show(int[][] multiplication, int size) {
        System.out.println("Multiplication of two matrix: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(multiplication[i][j] + " ");
            }
            System.out.println();
        }
    }
}