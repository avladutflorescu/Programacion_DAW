package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {
    public static int [] filtraPrimos  (int matriz []){
        int resultado [] = new int[matriz.length];
        for (int i = 1; i <matriz.length ; i++) {

                if (matriz[i]%matriz[i] !=0){
                    resultado[i]=matriz[i]--;

            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        System.out.println("Introduce el numero de valores");
        int longitud =sc.nextInt();
        int matriz []= new int[longitud];
        for (int i = 0; i <matriz.length ; i++) {
            matriz[i]=(int) (Math.random()*1000);
            System.out.println(Arrays.toString(filtraPrimos(matriz)));
        }
    }
}
