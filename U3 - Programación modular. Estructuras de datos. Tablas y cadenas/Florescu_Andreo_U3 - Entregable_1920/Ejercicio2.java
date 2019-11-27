package com.vf;

import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {


    int  matriz[][] = new int[6][5];
        for (int i = 0; i <4 ; i++) {
            System.out.println();
            for (int j = 0; j <5; j++) {
                matriz[j][i]=(int)(Math.random()*10);
                System.out.print(matriz[j][i]+" ");
                matriz[5][i] = 0;
                matriz[5][i] = matriz[5][i]+ matriz[1][i];



                }
            System.out.print(matriz [5][i]);


            System.out.print( matriz[5][i]);
            }
        }

}

