import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] matrix = new int[n+1][n+1];
        
        for(int i=0;i<n+1;i++){
            Arrays.fill(matrix[i], 0);
        }
        

        for(int i=0;i<m;i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            matrix[x][y] = x*y;
        }

        //print
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(matrix[i][j]+" ");                
            }
            System.out.println();
        }
    }
}