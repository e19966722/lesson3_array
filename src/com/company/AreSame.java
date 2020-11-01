package com.company;
import java.util.Scanner;

public  class AreSame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("a = ");
       int a = CorrectIntegerNumber(sc);
        System.out.print("b = ");
        int b = CorrectIntegerNumber(sc);
        areSame(a,b);
    }
    public  static int CorrectIntegerNumber(Scanner sc){
         boolean  k=sc.hasNextInt();
            while (!k) {
                System.out.print("The input is not an integer ");
                System.out.print("enter number  ");

                sc.next();
                k=sc.hasNextInt();
            }

        return sc.nextInt();
    }
    public static void areSame ( int a, int b){
            String msg = ((a & b) == a && (a & b) == b) ? "Same" : "not Same";
            System.out.println(msg);
        }

}
