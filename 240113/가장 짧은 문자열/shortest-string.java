import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<3;i++){
            String test = scanner.nextLine();
            int tmp = test.length();        
            //check
            if(min>tmp) min = tmp;
            if(max<tmp) max = tmp;
        }

        System.out.println(max-min);
        
    }
}