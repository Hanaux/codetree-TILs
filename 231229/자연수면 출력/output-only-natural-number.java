import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String result = "";

        if(a>0){
            for(int i=0;i<b;i++){
                result += a;
            }
        } else result = "0";
        System.out.println(result);
    }
}