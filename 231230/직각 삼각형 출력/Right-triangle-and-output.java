import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String result = "";
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(2*i-1);j++){
                result += "*";
            }
            result+="\n";
        }
        System.out.println(result);
    }
}