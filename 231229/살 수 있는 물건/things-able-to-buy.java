import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String result = "";

        if (n<1000) result = "no";
        else if(n<3000) result = "mask";
        else result = "book";

        System.out.println(result);
    }
}