import java.util.Scanner;

public class Main {

    public static float theAVRG(int[] a, int b){
        if (b < 1){
            return 0;
        }
        return (theAVRG(a, b - 1) * (b-1) + a[b-1]) / b;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];


        Scanner tc = new Scanner(System.in);
        for (int i = 0; i < a; i++){
            b[i] = tc.nextInt();
        }
        System.out.println(theAVRG(b, a));
    }
}
