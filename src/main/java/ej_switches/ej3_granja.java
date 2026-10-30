package ej_switches;

import java.util.Scanner;

public class ej3_granja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de comida diaria");
        int comidaDiaria = sc.nextInt();
        System.out.println("Introduce el numero de animales");
        int numAnimales = sc.nextInt();
        System.out.println("Introduce el numero de kilos de comida por animal");
        double kilosPorAnimal = sc.nextDouble();


        if (numAnimales == 0 || kilosPorAnimal == 0 || comidaDiaria == 0) {
            System.out.println("Introduce un numero valido");
        }
        else {
            double comidaNecesaria = numAnimales * kilosPorAnimal;
            if (comidaNecesaria <= comidaDiaria) {
                System.out.println("Hay comida suficiente");
            }
            else{
                int comidafalta = comidaDiaria / numAnimales;
                System.out.println("No hay comida suficiente. La nueva ración por animal será de: " + comidafalta + " kilos.");
            }





        }

    }
}
