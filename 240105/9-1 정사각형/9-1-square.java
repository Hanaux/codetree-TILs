import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int idx = 9;

        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){
                if(idx<1) idx = 9;
                System.out.print(idx);
                idx--;
            }
            System.out.println();
        }

    }
}