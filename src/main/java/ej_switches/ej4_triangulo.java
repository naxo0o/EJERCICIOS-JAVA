package ej_switches;

public class ej4_triangulo {
    static void main(String[] args) {


    double base = -2;
    double altura = 9;
    if (base >= 1 && altura >= 1){
        double area = base*altura;
        System.out.println("El area del triangulo es: " + area);
    }
    else {
        System.out.println("Introduce un numero valido");
    }
    }
}
