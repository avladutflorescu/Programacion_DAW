package com.company;

import java.util.Enumeration;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero no primo");
        int num = sc.nextInt();
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Introduce otro numeor");
                num=sc.nextInt();
                for (int j = 1; j < num; j++) {
                    if (num % j == 0) {
                        System.out.println("Introduce otro numeor");
                        num=sc.nextInt();
                    }
            }

        }
    }
}}