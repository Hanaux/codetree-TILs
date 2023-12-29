import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tmp = n;
        int result = 0;

        for(int i=1;i<n;i++){
            tmp = tmp/i;
            if(tmp<=1){
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}