package com.company;

import java.util.Scanner;

public class ArrayMultiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("array A n = ");
        int An = Math.abs(AreSame.CorrectIntegerNumber(sc));
        System.out.print("array A m = ");
        int Am = Math.abs(AreSame.CorrectIntegerNumber(sc));
        int[][] a=new int[An][Am];
        System.out.print("array B n = ");
       int Bn = Math.abs(AreSame.CorrectIntegerNumber(sc));
        System.out.print("array B m = ");
        int  Bm = Math.abs(AreSame.CorrectIntegerNumber(sc));
        int[][] b=new int[Bn][Bm];
        if(Am==Bn)
        ArrayInput(a, sc);
        ArrayInput(b,sc);
        DoubleArrayMultiplication(a,b);
    }
public static void ArrayInput(int[][] array,Scanner sc){
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
            System.out.print("["+i+""+j+"] = ");
            array[i][j]=AreSame.CorrectIntegerNumber(sc);
            System.out.println();
        }
        System.out.println();
    }

}
public static void DoubleArrayMultiplication(int[][] a, int[][] b) {
    int   itemMultiplication;
    int[][] c = new int[a.length][b[0].length];

    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < b[i].length; j++) {
            int k = 0;
            itemMultiplication = 0;
            while (k < b[i].length) {
                itemMultiplication += (a[i][k] * b[k][j]);

                k++;
            }
            c[i][j] = itemMultiplication;
            System.out.println();

        }
        System.out.println();
    }

    System.out.println();

    for (int i = 0; i < c.length; i++) {
        for (int j = 0; j < c[i].length; j++) {
            System.out.print(c[i][j]+" ");
        }
        System.out.println();
    }
    }

}
