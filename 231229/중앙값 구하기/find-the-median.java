import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numList = new int[3];

        for(int i=0;i<3;i++) numList[i] = scanner.nextInt();

        Arrays.sort(numList);
        System.out.println(numList[1]);
    }
}