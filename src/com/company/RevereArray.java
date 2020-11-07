package com.company;

import java.util.Random;
import java.util.Scanner;

public class RevereArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("array length = ");
        int n = Math.abs(AreSame.CorrectIntegerNumber(sc));
        int[] array=new int[n];
        if(n>0) {
            setRandomArray(array,n);
            Reverse(array,n);
            System.out.println();
            setRandomArray(array,n);
            System.out.println();
            ReverseTwo(array,n);
            System.out.println();
            setRandomArray(array,n);
            ReverseBinary(array,n);
        }
        else {System.out.println("a[]");}

    }
    public static void setRandomArray(int[] array,int n){
        Random random=new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100);
            System.out.print("arr[" + i + "]=" + array[i] + " ");
        }
    }
   public static void Reverse(int[] arr, int n){
        int k;
        for(int i=0;i<n/2;i++){
                k=arr[i];
                arr[i]=arr[n-i-1];
                arr[(n-i-1)]=k;

        }
        System.out.println();
        for (int i =0;i<n;i++){
            System.out.print("arr["+i+"]="+arr[i]+" ");
        }
        System.out.println();
    }
    public static void ReverseTwo(int[] arr, int n){
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i] + ",");
        }

    }
    public static void ReverseBinary(int[] arr, int n){
        for(int i=0;i<n/2;i++){
            arr[i]=arr[i]^arr[n-i-1];
            arr[n-i-1]=arr[i]^arr[n-i-1];
            arr[i]=arr[i]^arr[n-i-1];
        }
        System.out.println();
        for (int i =0;i<n;i++){
            System.out.print("arr["+i+"]="+arr[i]+" ");

        }
    }

}