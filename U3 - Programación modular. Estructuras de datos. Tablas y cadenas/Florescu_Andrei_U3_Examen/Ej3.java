package com.company;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Itroduce la posicion del alfil");
        String posicion=sc.next();
        String tablero[][]=new String[8][8];
        for (int i = 0; i <8 ; i++) {
            for (int j = 0; j <8 ; j++) {
               if (j==0){
                   tablero [i][j]=8-i+"a"+" ";
               }
                if (j==1){
                    tablero [i][j]=8-i+"b"+" ";
                }
                if (j==2){
                    tablero [i][j]=8-i+"c"+" ";
                }  if (j==3){
                    tablero [i][j]=8-i+"d"+" ";
                }  if (j==4){
                    tablero [i][j]=8-i+"e"+" ";
                }  if (j==5){
                    tablero [i][j]=8-i+"f"+" ";
                }  if (j==6){
                    tablero [i][j]=8-i+"g"+" ";
                }  if (j==7){
                    tablero [i][j]=8-i+"h"+" ";
                }
            }
        }
        for (int i = 0; i <8 ; i++) {
            System.out.println();
            for (int j = 0; j <8 ; j++) {
                System.out.print(tablero[i][j]);
            }
        }
    }
}
