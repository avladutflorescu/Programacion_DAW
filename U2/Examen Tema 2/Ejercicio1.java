package com.company;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero impar igual o superior a 5");
        int num = sc.nextInt();
        if (num >= 5 && num % 2 != 0) {
            for (int i = 0; i < num; i++) {
                System.out.print("M");
            }
            System.out.println();
            for (int i = 1; i < (num) / 2; i++) {
                System.out.print("M");

                for (int j = 1; j < num - 1; j++) {
                    System.out.print(" ");

                }System.out.println("M");
            }


            for (int i = 0; i < num; i++) {
                System.out.print("M");
            }
            System.out.println();

            for (int i = num /2+1 ; i < num-1; i++) {
                System.out.print("M");
                for (int j = 1; j < num - 1; j++) {
                    System.out.print(" ");
                }
                System.out.println("M");
            }
                for (int i = 0; i < num; i++) {
                    System.out.print("M");
                }


            }
        }
    }