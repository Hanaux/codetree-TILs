import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int idx = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i%2==0){
                    idx++;
                    System.out.print(idx + " ");

                }else{
                    idx+=2;
                    System.out.print(idx + " ");
                }
            }
            System.out.println();
        }
    }
}