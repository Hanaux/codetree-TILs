import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] result = new int[n];
        
        for(int i=0;i<n;i++){
            result[i] = scanner.nextInt();
        }

        for(int i=n-1;i>=0;i--){
            int print = result[i];
            if(print%2==0) System.out.print(print+" "); 
        }
    }
}