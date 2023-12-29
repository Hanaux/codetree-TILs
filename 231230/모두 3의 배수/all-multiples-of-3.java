import java.util.*;

public class Main {
    static int multiCheck(int n){
        if(n%3==0) return 1;
        else return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;

        for(int i=0;i<5;i++){
            int tmp = scanner.nextInt();
            if(multiCheck(tmp)==0){
                result = 0;
                break;
            } 
            result = 1;
        }
        System.out.println(result);


    }
}