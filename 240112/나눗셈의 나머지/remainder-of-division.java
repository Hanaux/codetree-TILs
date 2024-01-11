import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] rest = new int[b];
        int start = a;

        while(true){
            int simRest = start%b;
            int potion =  start/b;

            rest[simRest]++;
            start = potion;

            if(start <= 1) break;
        }

        int count = 0;

        for(int i=0;i<b;i++){
            if(rest[i] == 0) continue;
            count += rest[i]*rest[i];
        }

        System.out.print(count);

    }
}