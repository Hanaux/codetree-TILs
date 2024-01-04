import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for(int i=2;i<=8;i+=2){
            for(int j=b;j>=a;j--){
                if(j!=b) System.out.print(" / ");
                System.out.print(j+" * "+i+" = "+j*i);
            }
            System.out.println();
        }
    }
}