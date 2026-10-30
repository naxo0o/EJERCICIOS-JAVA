package ej_switches;

import java.util.Scanner;

public class ej2_dni {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu DNI para calcular la letra: ");
        int dni = sc.nextInt();
        int resto = dni % 23;
        String letra = "";
        switch (resto) {
        case 0:
            letra = "T";
            break;
        case 1:
            letra = "R";
            break;
        case 2:
            letra = "W";
            break;
        case 3:
            letra = "A";
            break;
        case 4:
            letra = "G";
            break;
        case 5:
            letra = "M";
            break;
        case 6:
            letra = "Y";
            break;
        case 7:
            letra = "F";
            break;
        case 8:
            letra = "P";
            break;
        case 9:
            letra = "D";
            break;
        case 10:
            letra = "X";
            break;
        case 11:
            letra = "B";
            break;
        case 12:
            letra = "N";
            break;
        case 13:
            letra = "J";
            break;
        case 14:
            letra = "Z";
            break;
        case 15:
            letra = "S";
            break;
        case 16:
            letra = "Q";
            break;
        case 17:
            letra = "V";
            break;
        case 18:
            letra = "H";
            break;
        case 19:
            letra = "L";
            break;
        case 20:
            letra = "C";
            break;
        case 21:
            letra = "K";
            break;
        case 22:
            letra = "E";
            break;
        default:
            System.out.println("Error en el cálculo.");
            break;

        }
        System.out.println("Tu DNI es: " + dni + " y la letra: " + letra);

    }
}
