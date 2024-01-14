import java.util.*;

public class Main {
    static String plz(int req, String input){
        String result = input;
        int length = result.length();

        switch(req){
            case 1 :
                result = result.substring(1)+result.substring(0,1);
                break;
            case 2 :
                result = result.substring(length-1)+result.substring(0,length-1);
                break;
            case 3 :
                String tmp = "";
                for(int i=length-1;i>=0;i--){
                    tmp += result.substring(i, i+1);
                }
                result = tmp;
                break;
            default : 
                break;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int q = scanner.nextInt();

        for(int i=0;i<q;i++){
            int req = scanner.nextInt();
            // System.out.println(req);
            input = plz(req, input);
            System.out.println(input);
        }

    }
}