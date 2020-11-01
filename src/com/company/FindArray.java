package com.company;
import java.util.Scanner;

public class FindArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("array length = ");
        int n = Math.abs(AreSame.CorrectIntegerNumber(sc));
        int[] array=new int[n];
        for (int i=0;i<n;i++){
            System.out.print("array ["+i+"] = ");
            array[i]=AreSame.CorrectIntegerNumber(sc);
            System.out.println();
        }
        findArray(array,n);
    }

    public static void findArray(int arr[], int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i!=j)
                    try {
                        if ((arr[j] % arr[i]) == 0) { count++; } else break;

                    } catch (ArithmeticException a) { System.out.print("-1");return; }
              }
                if (count ==(n-1)) {
                    count = arr[i];break;
                }else {count=-1;}
            }
        System.out.print(count);

    }
}
