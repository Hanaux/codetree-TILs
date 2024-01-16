import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        
        for(int i=0;i<n;i++){
            sum += scanner.nextInt();
        }
        String tmp = Integer.toString(sum);
        char[] list = tmp.toCharArray();

        for(int i=1;i<list.length;i++){
            System.out.print(list[i]);
        }
        System.out.print(list[0]);
    }
}