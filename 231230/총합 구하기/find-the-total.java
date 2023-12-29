import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;

        int check = (a/6)*6;

        while(check<=b){
            if(check>=a && check%8 != 0){
                sum += check;
            }
            check += 6;
        }

        System.out.println(sum);
    }
}