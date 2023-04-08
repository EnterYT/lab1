import java.util.Scanner;

public class Main {
    public static int isPrime(int a, int b) {
        if (b < 2){
            return a + 1;
        }
        return isPrime(a, b - 1) % a;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(isPrime(a, a));
    }
}
