import java.util.Scanner;

public class Main {
    static String numbers = "0123456789";
    public static boolean isNumber(String a, int b){

        if (!numbers.contains(c)) return false;

        return (isNumber(a, b - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int b = a.length();
        System.out.println(isNumber(a, b));

    }
}
