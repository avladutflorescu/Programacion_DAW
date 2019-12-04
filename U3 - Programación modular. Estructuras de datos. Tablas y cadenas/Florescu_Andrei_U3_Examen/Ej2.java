package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {
    public static int [] insertarValor (int matriz [],int posicion, int valor){
        int resultado []=new int[matriz.length+1];
        for (int i = 0; i <matriz.length ; i++) {
            if (resultado[i]==resultado[posicion]){
                resultado [posicion]=valor;
            }
            if (resultado[i]<resultado[posicion]){
                resultado[i]=matriz[i];
            }
            if (resultado[i]>=resultado[posicion]){
                resultado[i+1]=matriz[i];
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de valores");
        int longitud = sc.nextInt();
        int matriz []=new int [longitud];
        for (int i = 0; i <matriz.length ; i++) {
            matriz[i]=(int) (Math.random()*100);
        }
        System.out.println("Introdece el valor que quieres insertar");
        int valor=sc.nextInt();
        System.out.println("Introduce la posicion");
        int posicion=sc.nextInt();
        System.out.println(Arrays.toString(insertarValor(matriz, posicion, valor)));
    }
}

