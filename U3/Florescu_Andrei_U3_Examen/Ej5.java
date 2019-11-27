package com.company;

import java.util.Arrays;

public class Ej5 {
    public static String  [] UnirVectores (String v1 [], String v2 []) {
        String resultado [] =new String [v1.length+v2.length];
        for (int i = 0; i <resultado.length ; i++) {
            if (i<v1.length){
                resultado[i]=v1[i];
            }else resultado[i]=v2[i-v1.length];
        }

        return resultado;
    }
        public static String [] RotarVectores (String v3 []){
            String resultado [] =new String [v3.length];
            for (int i = 0; i <resultado.length ; i++) {
                if (i>=2){
                    resultado [i]=v3[i-2];
                }else
                    resultado[1]=v3[v3.length-1];
                    resultado[0]=v3[v3.length-2];


            }
            return resultado;
        }


    public static void main(String[] args) {
        String v1 [] = {"a","b","c"};
        String v2 [] = {"d","e","f"};
        System.out.println("La union de v1 y v2 es:");
        System.out.println(Arrays.toString(UnirVectores(v1,v2)));
        System.out.println();

        System.out.println("La rotacion del vector es:");
        String v3 [] = {"a","b","c","d","e","f"};
        System.out.println(Arrays.toString(RotarVectores(v3)));
    }
    }




