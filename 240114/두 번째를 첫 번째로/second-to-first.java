import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String result = "";
        String from = input.substring(1,2);
        String to = input.substring(0,1);

        result = input.replace(from, to);
        System.out.println(result);
    }
}