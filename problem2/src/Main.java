import java.util.Scanner;

public class Main {
    public static float theAVRG(int[] a){
        float sum = 0;
        for (int j : a) {
            sum += j;
        }
        sum /= a.length;
        return sum;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];


        Scanner tc = new Scanner(System.in);
        for (int i = 0; i < a; i++){
            b[i] = tc.nextInt();
        }
        System.out.println(theAVRG(b));
    }
}
