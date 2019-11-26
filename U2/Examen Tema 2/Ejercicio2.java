package com.company;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce el numero");
        long num=sc.nextLong();
        System.out.println("Introsuce la posicion");
        int posicion=sc.nextInt();
        String numero=Long.toString(num);
        System.out.print(" Los numeros partidos son ");
        for (int i = 0; i <posicion-1 ; i++) {
            System.out.print(numero.charAt(i));
        }
        System.out.print(" y ");
        for (int i = posicion-1; i <numero.length() ; i++) {
            System.out.print(numero.charAt(i));
        }

        
    }
}
