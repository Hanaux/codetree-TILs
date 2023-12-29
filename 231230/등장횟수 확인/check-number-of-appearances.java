import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        for(int i=0;i<5;i++){
            int tmp = scanner.nextInt();
            if(tmp%2==0) count++;
        }
        System.out.println(count);
    }
}