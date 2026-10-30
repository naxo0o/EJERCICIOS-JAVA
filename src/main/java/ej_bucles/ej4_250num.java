package ej_bucles;


public class ej4_250num {
    static void main(String[] args) {
        int suma = 0;
        int contador = 0;
        for (int numero = 1; numero <= 500; numero+=2){
            suma = suma + numero;
            contador = contador + 1;
            System.out.println(contador + ": " + numero);
        }
        System.out.println(suma);
    }
}
