import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        for(int i=0;i<n;i++){
            int test = scanner.nextInt();

            if(test==2) count++;
            if(count==3) {
                System.out.println(i+1);
                break;
            }
        }

    }
}