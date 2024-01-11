import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int[] twice = new int[10];

        twice[0] = a1;
        twice[1] = a2;

        for(int i=0;i<twice.length;i++){

            if(i==0 || i==1) {
                System.out.print(twice[i] + " ");
                continue;
            }
            
            twice[i] = twice[i-1] + 2*twice[i-2];
            
            System.out.print(twice[i]+ " ");
        }

    }
}