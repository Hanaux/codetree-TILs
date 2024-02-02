import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int idx = 1;
        int answer = 0;

        while(true){
            int tmp = n*idx;
            if(tmp%m==0){
                answer = tmp;
                break;
            }
            idx++;
        }

        System.out.println(answer);
    }
}