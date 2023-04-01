package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i=0; i<n; i++){
            array[i] = scanner.nextInt();
        }
        int min = findMinFromArr(array, n);
        System.out.println("Minimum is " + min);
    }
    public static int findMinFromArr(int[] arr, int n){
        if(n==1)
            return arr[0];
        else{
            int min = findMinFromArr(arr, n-1);
            return Math.min(min, arr[n-1]);
        }
    }

}
