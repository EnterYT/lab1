import java.util.Scanner;

public class Main {
    public static int thePOW(int a, int b){//Function for finding the bth power of number a
        if (b == 0)//Base condition
            return 1;
        return a * thePOW(a, b - 1);//Function calls itself
    }

    public static void main(String[] args) {//Main function
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//The number
        int b = sc.nextInt();//The power of number
        System.out.println(thePOW(a, b));
    }
}
