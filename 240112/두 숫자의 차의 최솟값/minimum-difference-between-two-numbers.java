import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        int[] diff = new int[n];

        for(int i=0;i<n;i++){
            diff[i] = scanner.nextInt();
            if(i>0){
                int tmp = diff[i]-diff[i-1];
                if(tmp<min) min = tmp;
            }
        }
        System.out.println(min);

    }
}