package com.vf;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("¿Cuántos son? (Introduzca -1 para salir del programa):");
          int num=sc.nextInt();
        String matriz[][] = new String[2][11];
        matriz[0][0]= ("Mesa No");
        matriz[1][0]= ("Ocupación");
        int ocup= (int) (Math.random()*4);

        if (num>4){
              System.out.println("Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como máximo e intente de nuevo");
          }else{


            for (int j = 0; j <2 ; j++) {
                System.out.println();
                for (int i = 1; i <11 ; i++) {
                    matriz[0][i]= String.valueOf((i));
                    System.out.print(matriz[i]);

            }
        }

    }
}}
