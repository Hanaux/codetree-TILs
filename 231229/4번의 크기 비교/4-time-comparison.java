import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for(int i=0;i<4;i++){
            if(a > scanner.nextInt()) System.out.println(1);
            else System.out.println(0);
        }
        
    }
}