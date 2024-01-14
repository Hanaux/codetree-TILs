import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String orders = scanner.nextLine();
        int length = input.length();

        for(int i=0;i<orders.length();i++){
            char order = orders.charAt(i);

            if(order == 'L'){
                input = input.substring(1)+input.substring(0,1);
            }else{
                input = input.substring(length-1)+input.substring(0,length-1);
            }
        }

        System.out.println(input);
    }
}