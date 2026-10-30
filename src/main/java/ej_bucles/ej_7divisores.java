package ej_bucles;

import java.util.Scanner;

public class ej_7divisores {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        System.out.println("Los divisores de " + numero + " son:");
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0){
                System.out.println(i);
            }
        }
    }
}
