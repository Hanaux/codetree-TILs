import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[4][4];
        int col = 0; int row = 0;
        int sum = 0;

        for(int i=0;i<16;i++){
            matrix[row][col] = scanner.nextInt();
            if(row>=col) sum += matrix[row][col];
            col++;
            if(col>3){
                col = 0;
                row++;
            }
        }

        System.out.println(sum);
    }
}