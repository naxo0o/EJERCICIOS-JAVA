package ej_condicionales;

import java.util.Scanner;

public class ej3_examen {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce la nota: ");
        double nota=sc.nextDouble();

        System.out.print("¿Ha entregado el trabajo? (true/false): ");
        boolean trabajo = sc.nextBoolean();

        if (nota>=7.5 || nota >=4.5 && trabajo == true && nota<=10 )
        {
            System.out.println("Aprobado");
        }
        else {
            System.out.println("Suspendido");
        }
        sc.close();
    }
}
