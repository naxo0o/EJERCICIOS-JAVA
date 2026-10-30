package ej_excepciones;

import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Introduce el primer numero: ");
            double n1 = sc.nextDouble();
            System.out.println("Introduce el numero por el que dividirlo: ");
            double n2 = sc.nextDouble();
            assert n2 != 0: "El divisor no puede ser 0";
            double resultado = n1/n2;
            System.out.println("Resultado: " + resultado);
        }
        catch(AssertionError e){
            System.out.println("Error de aserción: " + e.getMessage());
        } catch (ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    }

