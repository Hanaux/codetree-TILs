import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int a = scanner.nextInt();
        String result = "";

        while(b>=a){
            result += b + " ";
            b = b-2;
        }

        System.out.println(result);
    }
}