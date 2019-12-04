package com.company;
import java.util.Scanner;
public class Ej1 {

    public static int maxMatriz (int[][] matriz, int filas, int columnas) {
        int mayor = 0;
        for (int i = 0; i <filas ; i++) {
            for (int j = 0; j <columnas ; j++) {
                matriz [i][j]=(int) (Math.random()*1000);
                if (matriz [i][j]>mayor){
                    mayor=matriz[i] [j];
                }
            }
        }
        return mayor;
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Introduce el numero de filas");
        int filas=sc.nextInt();

        System.out.println("Introduce el numero de columnas");
        int columnas =sc.nextInt();

        int matriz [][] = new int [filas][columnas ];
        System.out.println(maxMatriz(matriz,filas,columnas));

        for (int i = 0; i <filas ; i++) {
            System.out.println();
            for (int j = 0; j <columnas ; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
        }
    }
}


