import java.util.Scanner;

public class Main {

    public static int biCoef(int n, int k){
        if (n == k || n == 0 || k ==0){
            return 1;
        }
        return (biCoef(n - 1, k) + biCoef(n-1, k-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(biCoef(a, b));
    }
}
