import java.util.Scanner;

public class Main {
    public static String theReverse(int[] a, int b){
        if (b < 1)
            return "";
        return (Integer.toString(a[b-1]) + " " + theReverse(a , b - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];

        Scanner tc = new Scanner(System.in);
        for (int i = 0; i < a; i++){
            b[i] = tc.nextInt();
        }

        System.out.println(theReverse(b, a));

    }
}
