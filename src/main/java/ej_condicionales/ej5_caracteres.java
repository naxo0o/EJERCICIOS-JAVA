package ej_condicionales;

import java.util.Scanner;

public class ej5_caracteres {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        char letra;
        if (numero % 2 == 0){
            letra = 'A';

        }
        else{
            letra = 'B';
        }
        System.out.println(letra);
    }
}
