package ej_condicionales;

import java.util.Scanner;

public class ej6_nota1 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el valor de la nota: ");
        int nota = sc.nextInt();
        if (nota > 7){
            nota = nota + 1;
            System.out.println("Se suma uno a la nota: " + nota);

        }
        else{
            System.out.println("No se suma nada: " + nota);
        }
    }
}
