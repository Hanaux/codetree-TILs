import java.util.*;

public class Main {

    static int result(int age, char gender){
        if (age>=19 && gender=='M') return 1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int printIt=0;
        
        for(int i=0;i<2;i++){
            int age = scanner.nextInt();
            char gender = scanner.next().charAt(0);

            printIt = result(age, gender);

            if(printIt==1) break;
        }

        System.out.println(printIt);
        
    }
}