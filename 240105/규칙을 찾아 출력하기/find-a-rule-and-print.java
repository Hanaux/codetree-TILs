import java.util.*;

public class Main {
/*
    static String printStar(int n){
        String result = "";
        for(int i=0;i<n;i++){
            result += "* ";
        }
        return result;
    }*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] result = new String[n+1];
        Arrays.fill(result, "");

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1){
                    result[i] += "* ";
                }
                else if(i>j) {
                    result[i] += "* ";
                }
                else if(j==n){
                    result[i] += "* ";
                }
                else {
                    result[i] += "  ";
                }

            }

        }
        for(int i=1;i<n+1;i++){
            System.out.println(result[i]);
        }
        


    }
}