import java.util.*;

public class Main {
    static void printStar(int n){
        String star = "";
        for(int i=0;i<n;i++){
            star += "* ";
        }
        System.out.println(star);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] stock = new int[n];

        int start = 1;
        int fin = n;

        for(int i=0;i<stock.length;i++){
            if(i%2==0){
                stock[i]=fin;
                fin--;
            }else{
                stock[i]=start;
                start++;
            }
        }

        for(int i=0;i<stock.length;i++){
            printStar(stock[i]);
        }
        for(int i=n-1;i>=0;i--){
            printStar(stock[i]);
        }
        
    }
}