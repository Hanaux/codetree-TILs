import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] result = new String[n];

        //initialize
        for(int i=0;i<n;i++){
            result[i] = "";
        }

        //left side
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<n-i) result[i] += "*";
                else result[i] += " ";
            }
        }
        //right side
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i-j>0) result[i] += " ";
                else result[i] += "*";
            }
        }
        //print
        for(int i=0;i<n;i++){
            System.out.println(result[i]);
        }
        
        
    }
}