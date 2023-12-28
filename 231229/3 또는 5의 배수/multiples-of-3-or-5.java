import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        String result;

        result = (a%3==0)? "YES" : "NO";
        result += "\n";
        result += (a%5==0)? "YES" : "NO";

        System.out.println(result);
    }
}