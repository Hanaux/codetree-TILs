import java.util.*;

public class Main {
    static String removeAlpha(String a){
        char[] tmpBox = a.toCharArray();
        String result = "";

        for(int i=0;i<tmpBox.length;i++){
            if(tmpBox[i]>64) continue;
            result += tmpBox[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        int pre = Integer.parseInt(removeAlpha(a));
        int post = Integer.parseInt(removeAlpha(b));
        System.out.println(pre+post);
        
        
    }
}