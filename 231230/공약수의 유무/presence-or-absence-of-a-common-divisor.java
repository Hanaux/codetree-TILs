import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = 0;

        for(int i = 1;i<=960;i++){
            if(1920%i == 0 && 2880%i ==0){
                if(i>=a && i<=b){
                    result = 1;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}