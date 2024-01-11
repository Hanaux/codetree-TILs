import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] box = new int[n][n];
        int count = 1;
        int col = n-1; int row = n-1;
        boolean isUp = true;

        for(int i=0;i<n*n;i++){
            box[row][col] = count;
            if(isUp){
                row--;
            }else{
                row++;
            }
            if(isUp && row<0){
                row = 0;
                col--;
                isUp = false;
            }else if(!isUp && row>=n){
                row = n-1;
                col--;
                isUp = true;
            }
            count++;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(box[i][j]+" ");
            }
            System.out.println();
        }
    }
}