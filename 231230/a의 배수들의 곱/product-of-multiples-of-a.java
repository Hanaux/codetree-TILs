import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int tmp = a;
        int result = 1;

        while(tmp<=b){ 
            result = result*tmp;
            tmp += a;
        }
        System.out.println(result);
    }
}