import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] result = new int[10];

        for(int i=0;i<10;i++){
            int check = scanner.nextInt();
            result[i] = check;
            if(i!=0 && result[i]%3==0){
                System.out.println(result[i-1]);
                break;
            }
            
        }

    }
}