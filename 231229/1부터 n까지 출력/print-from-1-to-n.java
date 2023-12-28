import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String result = "";
        for(int i=1;i<n;i++)  result += i + " ";
        result += n;

        System.out.println(result);
    }
}