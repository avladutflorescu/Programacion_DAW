package com.vf;

import java.util.Arrays;

public class Ejercicio3 {
    public static int[] filtraCon7(int matriz []){
        int contador =1;
        int [] resultado = new int[contador];


        for (int i = 0; i <matriz.length ; i++) {
            if (Integer.toString(matriz[i]).contains("7")){
                resultado = new int[contador];
                contador++;

                resultado[contador]=matriz[i];
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        int[] matriz= { 4, 76, 9, 87, 2, 7, 9 };
        System.out.println(Arrays.toString(filtraCon7(matriz)));
    }
}
