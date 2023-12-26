public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;
        int tempA, tempB, tempC;
        
        tempB= b;
        b = a;
        tempC = c;
        c = tempB;

        tempA = a;
        a = tempC;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}