import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String phoneNum = scanner.nextLine();
        String[] sepNum = phoneNum.split("-");
        String result = sepNum[0] + "-" + sepNum[2] +"-" +sepNum[1];

        

        System.out.println(result);
    }
}