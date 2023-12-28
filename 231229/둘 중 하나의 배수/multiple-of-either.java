import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int result = 0;

        if (a%3==0 || a%5==0) result = 1;

        System.out.println(result);
    }
}