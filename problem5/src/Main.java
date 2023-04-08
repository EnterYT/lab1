import java.util.Scanner;

public class Main {
    static int fib(int n)//Function for finding nth number in fibonacci sequence
    {
        if (n <= 1)//Base condition
            return n;
        return fib(n - 1) + fib(n - 2);//The function calls itself
    }

    public static void main(String[] args) {//Main function
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//Entering the number
        System.out.println(fib(a));//Calls the function
    }
}
