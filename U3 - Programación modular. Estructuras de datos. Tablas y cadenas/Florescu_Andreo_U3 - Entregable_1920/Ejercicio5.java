package com.vf;

public class Ejercicio5 {
    public static int aleatorioDeArray(int[] matriz){
        int posicion=(int) (Math.random()*matriz.length);
        return matriz[posicion];
    }

    public static void main(String[] args) {
        int[] matriz= { 4, 6, 9, 8, 2, 7, 9 };
        System.out.println(aleatorioDeArray(matriz));
    }
}
