import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String condition = scanner.next();
        int n = condition.length();
        int idx = n/2;
        int m = 0;
        char[] result = new char[idx];

        for(int i=0;i<n;i++){
            if(i%2==0) continue;

            result[m] = condition.charAt(i);
            m++;
        }

        for(int i=idx-1;i>=0;i--){
            System.out.print(result[i]);
        }
        // for(char c : result){
        //     System.out.print(c);
        // }

    }
}