package com.company;

import com.sun.xml.internal.txw2.annotation.XmlCDATA;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        String numero = Long.toString(num);
        System.out.print("Dígitos que aparecen: ");
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <numero.length() ; j++) {
            if (numero.charAt(j) == i) {
                System.out.println(i);
            }
        }
    }
    }
}





            



