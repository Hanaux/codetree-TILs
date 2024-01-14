import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        int count = 0;

        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==b.charAt(0) && a.charAt(i+1)==b.charAt(1)) count++;
        }

        System.out.println(count);
        
    }
}