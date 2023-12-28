import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String phoneNum = scanner.nextLine();
        String[] sepNum = phoneNum.split("-");
        String result = sepNum[0];

        for(int i=2;i>0;i--){
            result += "-";
            result += sepNum[i];
        }

        System.out.println(result);
    }
}