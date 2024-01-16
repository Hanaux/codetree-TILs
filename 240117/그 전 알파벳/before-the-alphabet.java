import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input = scanner.next().charAt(0);
        char result = (char)122;

        if(input!=97){
            result = (char) (input-1);
        }

        System.out.print(result);
    }
}