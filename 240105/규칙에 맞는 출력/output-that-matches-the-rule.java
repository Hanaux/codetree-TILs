import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=0;i<n;i++){
            for(int j=n-i;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}