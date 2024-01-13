import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        // 1행
        for(int i=0;i<n;i++){
            matrix[0][i] = 1;
            matrix[i][0] = 1;
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                matrix[i][j] = matrix[i-1][j] + matrix[i][j-1] + matrix[i-1][j-1];
            }
        }

        //print
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

    }
}