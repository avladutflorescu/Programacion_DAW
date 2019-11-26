package com.vf;

public class Ejercicio4 {
    public static String convierteArrayEnString(int[] matriz){
        String resultado="";
        for (int i = 0; i <matriz.length ; i++) {
            resultado=resultado+matriz[i];
        }
        return "``"+resultado+"´´";
    }

    public static void main(String[] args) {
        int[] matriz= { 4, 6, 9, 8, 2, 7, 9 };
        System.out.println(convierteArrayEnString(matriz));

    }
}
