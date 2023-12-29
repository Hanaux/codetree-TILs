import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();

        for(int i=0;i<n;i++){
            a += n;
            System.out.println(a);
        }
    }
}