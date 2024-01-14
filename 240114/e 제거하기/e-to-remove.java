import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String result = "";

        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='e'){
                result = input.substring(0,i)+input.substring(i+1);
                break;
            }
        }

        System.out.println(result);
    }
}