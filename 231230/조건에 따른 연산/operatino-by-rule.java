import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tmp = n;
        int result = 0;

        while (true){
            if(tmp%2==0) tmp = tmp*3 +1;
            else tmp = tmp*2 +2;
            result++;
            if(tmp>1000) break;
        }

        System.out.println(result);
    }
}