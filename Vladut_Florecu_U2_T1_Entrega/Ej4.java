import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la altura (Debe ser un numero impar mayor o igual a 3)");
        int altura = sc.nextInt();
        if (altura < 3 || altura % 2 == 0) {
            System.out.println("Altura no valida");
        } else
            for (int i = 0; i < altura; i++) {
                System.out.println("*     * ");
                    for (int j = 1; j < i-1; j++) {
                        System.out.print(" ");  }
                for (int k= 1; k > i+1; k--) {
                    System.out.print(" ");  }


                            }



            }}

