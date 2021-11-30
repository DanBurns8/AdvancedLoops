package com.company;

public class AdvancedLoops {

    public static void eights(){
            for(int x=8; x>=2; x-=2){
                System.out.println("");
                System.out.print(x);
                for(int b=1; b<x; b++){
                    System.out.print(x);
                    }
                }
            }

    public static void main(String[] args) {
        System.out.println("Eights");
        eights();
    }
}
