package ej_excepciones;

public class animales {
    public static void main(String[] args) {
        double cantidadComida = 1200;
        int numAnimales = 0;
        double kilosPorAnimal = 12;
        if (cantidadComida >= (numAnimales*kilosPorAnimal) && numAnimales >= 1) {
            System.out.println("Hay suficiente comida");
        } else {
            try{
                double racion = (int)cantidadComida / numAnimales;
                System.out.println("La ración por animal es: " + racion);
                }
            catch (ArithmeticException e){
                System.out.println("Error: " + e.getMessage() + " Hay 0 animales");
            }
        }


    }
}
