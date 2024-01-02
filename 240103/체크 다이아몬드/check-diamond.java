import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] diamond = new String[2*n-1];
        Arrays.fill(diamond, "");
       
        //up
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                diamond[i] += " ";
            }
            for(int k=0;k<i+1;k++){
                diamond[i] += "* ";
            }

        }

        //down
        for(int i=n;i<2*n-1;i++){
            for(int j=0;j<i-n+1;j++){
                diamond[i] += " ";                
            }
            for(int k=0;k<2*n-i-1;k++){
                diamond[i] += "* ";
            }
        }

        //print
        for(int i=0;i<diamond.length;i++){
            System.out.println(diamond[i]);
        }


    }
}