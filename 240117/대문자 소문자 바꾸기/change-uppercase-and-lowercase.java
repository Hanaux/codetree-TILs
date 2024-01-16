import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char [] box = input.toCharArray();

        for(int i=0;i<box.length;i++){
            char tmp = box[i];
            //s->b
            if(tmp>90) tmp = (char)(tmp-32);
            else tmp = (char)(tmp + 32);

            System.out.print(tmp);
        }
    }
}