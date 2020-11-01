package com.company;

import java.util.Random;
import java.util.Scanner;

public class bubbleSortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("array length = ");
        int n = Math.abs(AreSame.CorrectIntegerNumber(sc));
        int[] array = new int[n];
        Random random = new Random();
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                array[i] = random.nextInt(100);
                System.out.print("arr[" + i + "]=" + array[i] + " ");
            }
            bubbleSort(array, n);
        } else {
            System.out.println("a[]");
        }

    }

    static void bubbleSort(int[] arr,int n) {
        int k;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    k = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = k;
                }

            }
        }
        System.out.println();
        for (int i =0;i<n;i++){
            System.out.print("arr["+i+"]="+arr[i]+" ");

        }

    }
}