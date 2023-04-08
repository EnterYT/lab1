import java.util.Scanner;

public class Main {
    public static String theReverse(int[] a, int b){//Function for printing the list in reverse order
        if (b < 1)//Base condition
            return "";
        return (Integer.toString(a[b-1]) + " " + theReverse(a , b - 1));//Function calls itself
    }

    public static void main(String[] args) {//Main function
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//The size of the list
        int[] b = new int[a];//The list of size of a

        Scanner tc = new Scanner(System.in);//Filling the list with numbers
        for (int i = 0; i < a; i++){
            b[i] = tc.nextInt();
        }

        System.out.println(theReverse(b, a));//Calls the function

    }
}
