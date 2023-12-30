import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String result = "";

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                result += "*";
            }
            result += "\n";
        }

        System.out.println(result);
        System.out.println(result);
    }
}