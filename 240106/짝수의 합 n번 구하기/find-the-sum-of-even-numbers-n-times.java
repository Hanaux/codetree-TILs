import java.util.*;

public class Main {
    static int getEven(int num){
        if(num%2==0) return num;
        else return num+1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for(int i=0;i<n;i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int result = 0;

            a = getEven(a);
            // b = getEven(b);

            while(a<=b){
                result += a;
                a += 2;
            }
            System.out.println(result);
        }


    }
}