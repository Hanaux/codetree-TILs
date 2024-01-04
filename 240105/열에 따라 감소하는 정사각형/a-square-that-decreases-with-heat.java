import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=n;i>0;i--){
            int idx = n;
            for(int j=n;j>0;j--){
                System.out.print(idx+" ");
                idx--;
            }
            System.out.println();
        }
    }
}