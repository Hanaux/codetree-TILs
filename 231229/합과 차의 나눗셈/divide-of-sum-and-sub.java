import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        double tmp = (double) (a+b) / (a-b);
        String result = String.format("%.2f", tmp);
        System.out.println(result);
    }
}