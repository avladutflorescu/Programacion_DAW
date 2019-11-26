package com.company;

import java.util.Scanner;

public class Ejercico5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el texto");
        String texto = sc.nextLine();
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a' || texto.charAt(i) == 'e' || texto.charAt(i) == 'i' || texto.charAt(i) == 'o' || texto.charAt(i) == 'u') {
                contador++;
            }
        }
        System.out.println("El texto contiene "+ contador+ " vocales");
    }
}
