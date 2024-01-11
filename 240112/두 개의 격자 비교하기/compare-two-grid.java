import java.util.*;

public class Main {
    static int check (int a1, int a2){
        if (a1 == a2) return 0;
        else return 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int [][] matrix = new int [n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = scanner.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int tmp = scanner.nextInt();
                matrix[i][j] = check(matrix[i][j], tmp);
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}