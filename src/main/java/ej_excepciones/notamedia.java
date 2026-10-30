package ej_excepciones;
import java.util.Scanner;

public class notamedia {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try {
            System.out.println("Introduce la nota: ");
            double nota = sc.nextDouble();
            assert nota >= 0 && nota <= 10 : "Error, nota invalida";

            System.out.println("Nota valida: " + nota);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());


        }
    }
}
