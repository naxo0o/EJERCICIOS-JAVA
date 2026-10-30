package ej_excepciones;

import java.util.Scanner;

public class cuenta_atras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Introduce un numero para iniciar la cuenta atras: ");
            int n = sc.nextInt();
            assert n >= 0 : "El numero inicial no puede ser negativo";

            while (n >= 0) {
                System.out.println(n);
                n--;
            }

            // Al salir del bucle, cuando n llega a -1, imprime el despegue
            System.out.println("Despegue");

        } catch (AssertionError exception) {
            System.out.println("Error de aserción: " + exception.getMessage());
        }
    }
}
