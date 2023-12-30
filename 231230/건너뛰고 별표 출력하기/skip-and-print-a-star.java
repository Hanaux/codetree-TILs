import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String result = "";
        int idx = 1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                result += "*";
            }
            result += "\n\n";
        }

        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                result += "*";
            }
            result += "\n\n";
        }

        System.out.println(result);
    }
}