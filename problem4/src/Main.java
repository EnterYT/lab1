import java.util.Scanner;

public class Main {
    public static int factorial(int n){//Function to find the factorial
        if (n == 1)//Base condition
            return 1;
        return n * factorial(n-1);//Function calls itself
    }

    public static void main(String[] args) {//Main function
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//Number which factorial is needed to find
        System.out.println(factorial(a));//Calling the function
    }
}
