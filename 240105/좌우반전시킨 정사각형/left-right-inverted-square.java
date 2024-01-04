import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int start = n;

        for(int i=0;i<n;i++){
            int idx = start * (i+1);
            for(int j=n;j>0;j--){
                System.out.print(idx+" ");
                idx -= (i+1);
            }
            System.out.println();
        }

    }
}