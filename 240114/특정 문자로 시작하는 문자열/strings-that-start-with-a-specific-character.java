import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String [] list = new String[n];

        for(int i=0;i<n;i++){
            list[i] = scanner.next();
        }

        char check = scanner.next().charAt(0);
        int count = 0;
        double sum = 0.0;

        for(int i=0;i<n;i++){
            if(list[i].charAt(0) == check){
                count++;
                sum += list[i].length();
            }

        }

        System.out.println(count+" "+ String.format("%.2f",sum/count));
    }
}