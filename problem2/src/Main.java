import java.util.Scanner;

public class Main {

    public static float theAVRG(int[] a, int b){//Function finding the avarage of elements in array a
        if (b < 1){//Base condition
            return 0;
        }
        return (theAVRG(a, b - 1) * (b-1) + a[b-1]) / b;//Functions calls itself
    }



    public static void main(String[] args) {//Main function
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//Number of elements to find average
        int[] b = new int[a];//Array of elements with size of a


        Scanner tc = new Scanner(System.in);
        for (int i = 0; i < a; i++){//Filling the array with elements
            b[i] = tc.nextInt();
        }
        System.out.println(theAVRG(b, a));//Calls the function to find the average
    }
}
