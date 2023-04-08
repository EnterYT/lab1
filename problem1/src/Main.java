import java.util.Scanner;

public class Main {

    public static void main(String[] args) {//Main function
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//Entering the number of elements
        int[] array = new int[n];//The array of elements with size of a
        for (int i=0; i<n; i++){//Fills the array with elements
            array[i] = scanner.nextInt();
        }
        int min = findMinFromArr(array, n);//Calls the function
        System.out.println("Minimum is " + min);
    }
    public static int findMinFromArr(int[] arr, int n){//Function to find the minimum value
        if(n==1)//Base condition
            return arr[0];
        else{
            int min = findMinFromArr(arr, n-1);//Defining previous minimum
            return Math.min(min, arr[n-1]);//Compares and finds the minimum
        }
    }

}
