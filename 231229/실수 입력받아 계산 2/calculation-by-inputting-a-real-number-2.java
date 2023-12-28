import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float a = Float.parseFloat(scanner.next());
        float b = a + 1.5f;
        String result=String.format("%.2f", b);
        System.out.println(result);
    }
}