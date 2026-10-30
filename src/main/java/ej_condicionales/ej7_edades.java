package ej_condicionales;

import java.util.Scanner;

public class ej7_edades {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la primera edad: ");
        int edad1 = sc.nextInt();
        System.out.println("Ingrese la segunda edad: ");
        int edad2 = sc.nextInt();
        if (edad1 + edad2 > 75){
            System.out.println("EXPERIENCIA");
        }
    }
}
