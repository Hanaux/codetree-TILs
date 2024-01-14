import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        boolean result = true;

        String pre = a+b;
        String post = b+a;

        for(int i=0;i<pre.length();i++){
            if(pre.charAt(i) != post.charAt(i)) {
                result = false;
                break;
            }
        }

        System.out.println(result);
    }
}