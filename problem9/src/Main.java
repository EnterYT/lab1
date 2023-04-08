import java.util.Scanner;

public class Main {

    public static int biCoef(int n, int k){//Function finding binomial Coefficient
        if (n == k || n == 0 || k ==0){//Base condition
            return 1;
        }
        return (biCoef(n - 1, k) + biCoef(n-1, k-1));//Function calls itself
    }

    public static void main(String[] args) {//Main function
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//Entering the values
        int b = sc.nextInt();
        System.out.println(biCoef(a, b));//Calls the function
    }
}
