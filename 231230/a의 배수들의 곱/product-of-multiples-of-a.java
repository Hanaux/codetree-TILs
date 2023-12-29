import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = 1;

        while(a<=b){
            result = result* a;
            a = a*2;
        }
        System.out.println(result);
    }
}