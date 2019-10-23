import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Introduce la nota del primer Examen");
        double nota1=sc.nextDouble();
        System.out.println("Introduce la nota del segundo Examen");
        double nota2 =sc.nextDouble();
        double media=(nota1+nota2)/2;
        if (media>=5){
        System.out.println("Has aprobado.");
            if (media>=5 && media<6 )
            System.out.println("Tu nota es: "+(nota1+nota2)/2+" (Suficiente)");
            if (media>=6 && media<7 )
                System.out.println("Tu nota es: "+(nota1+nota2)/2+" (Bien)");
            if (media>=7 && media<9 )
               System.out.println("Tu nota es: "+(nota1+nota2)/2+" (Notable)");
            if (media>=9 && media<10 )
                 System.out.println("Tu nota es: "+(nota1+nota2)/2+" (Sobresaliente)");

        }
        if (media<5)

        System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto)");
        String nota3=sc.next();
             if (nota3.equals("apto")){
                 System.out.println("Tu nota de Programación es 5 - Aprobado");
             if  (nota3.equals("no apto"));
             }else System.out.println("Error(reapuesta no valida");

    }}

