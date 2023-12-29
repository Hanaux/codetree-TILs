import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idx = 0;
        int sum = 0;

        while (true){
            int age = scanner.nextInt();
            if(age<20 || age>29) break;
            sum += age;
            idx++;
        }
        String result = String.format("%.2f", (float)sum/idx);

        System.out.println(result);
    }
}