import java.util.*;

public class Main {

    static int check(char[] a, char[] b){
        for(int i=0;i<a.length;i++){
            if(a[i] != b[i]){
                return -1;
            } 
        }
        return 1;
    }

    static char[] goRight(char[] a){
        char[] tmp = new char[a.length];
        
        tmp[0] = a[a.length-1];
        for(int i=0;i<a.length-1;i++){
            tmp[i+1] = a[i];
        }
        return tmp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        int count = 0;

        for(int i=0;i<a1.length;i++){
            if(check(a1, b1)==1){
                break;
            }
            a1 = goRight(a1);
            count++;
        }

        System.out.println(count);
        
    }
}