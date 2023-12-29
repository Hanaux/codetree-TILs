import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=0;i<n;i++){
            int tmp = scanner.nextInt();
            if(tmp%3 == 0 && tmp%2 == 1) System.out.println(tmp);
        }

    }
}