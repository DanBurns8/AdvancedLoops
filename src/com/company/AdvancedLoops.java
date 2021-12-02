package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class AdvancedLoops {

    public static void eights() {
        for (int x = 8; x >= 2; x -= 2) {
            System.out.println();
            for (int i = 0; i < (8 - x)/2; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < x; i++) {
                System.out.print(x);
            }
        }
    }

    public static void alternate(int x){
        for(int a=1; a<=x; a++){
            System.out.println();
            if(a%2==0) {
                for (int b = a; b > 0; b--) {
                    System.out.print(b);
                }
            }else {
                for(int c=1; c<=a; c++){
                    System.out.print(c);

                }
            }
        }
    }

    public static void isosceles(int x){
        for(int a=1; a<=x; a++){
            System.out.println();
            for(int z=a; z<x; z++){
                System.out.print(" ");
            }
            for(int d=1; d<a; d++){
                System.out.print(d);
            }
            for(int b=a; b>0; b--){
                System.out.print(b);
            }
        }
    }

    public static void upSideDown(int max, int min) {
        for (int b = max; b >= min; b--) {
            System.out.println();
            for(int f=b; f<max; f++){
                System.out.print(" ");
            }
            for (int z = b; z >= min; z--) {
                System.out.print(z);
            }
            for (int c = min+1; c <= b; c++) {
                System.out.print(c);
            }
        }
    }
        public static void main (String[]args){
            System.out.println("Eights");
            eights();
            System.out.println();
            System.out.println("Alternate");
            alternate(7);
            System.out.println();
            System.out.println();
            System.out.println("isosceles");
            isosceles(5);
            System.out.println();
            System.out.println();
            System.out.println("UpSideDown");
            upSideDown(9,4);
        }
    }
//Eights
//
//        88888888
//        666666
//        4444
//        22
//        Alternate
//
//        1
//        21
//        123
//        4321
//        12345
//        654321
//        1234567
//
//        isosceles
//
//        1
//        121
//        12321
//        1234321
//        123454321
//
//        UpSideDown
//
//        98765456789
//        876545678
//        7654567
//        65456
//        545
//        4
