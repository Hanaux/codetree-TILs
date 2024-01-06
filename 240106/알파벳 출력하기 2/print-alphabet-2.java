import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] result = new String[n];

        int index = 65;

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
            for(int k=i;k<n;k++){
                System.out.print((char)index + " ");
                index++;
            }
            System.out.print("\n");
        }
    }
}