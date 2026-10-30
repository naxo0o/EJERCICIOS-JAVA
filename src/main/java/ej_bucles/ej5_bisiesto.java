package ej_bucles;

import java.util.Scanner;

public class ej5_bisiesto {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("El año "+ year + " es bisiesto");
        }
        else {
            System.out.println(year + " no es bisiesto");
        }
        sc.close();
    }
}
