import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int b = scanner.nextInt();
        int a = scanner.nextInt();
        String result = "";

        for(int i = b;i>=a;i=i-2){
            result += i+" ";
        }

        System.out.println(result);
    }
}