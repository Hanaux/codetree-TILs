import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";

        for(int i=0;i<2;i++){
            String line = scanner.nextLine();
            String[] tmp = line.split(" ");

            for(int j=0;j<tmp.length;j++){
                result += tmp[j];
            }
            
        }
        System.out.println(result);

    }
}