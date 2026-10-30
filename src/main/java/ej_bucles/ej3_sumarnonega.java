package ej_bucles;

import java.util.Scanner;

public class ej3_sumarnonega {
    static void main(String[] args) {
        int cantidad = 0;
        int suma = 0;
        double media = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon un numero: ");
        int numero = sc.nextInt();

        while (numero > 0) {
            suma = suma + numero;
            cantidad = cantidad + 1;
            System.out.println("Introduce un numero: ");
            numero = Integer.parseInt(sc.next());
        }
        media = suma/cantidad;
        System.out.println("La suma total es: " + suma);
        System.out.println("La cantidad de numeros sumados es: " + cantidad);
        System.out.println("La media total es: " + media);


    }
}
