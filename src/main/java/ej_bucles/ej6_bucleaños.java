package ej_bucles;

public class ej6_bucleaños {
    static void main(String[] args) {
        int year;
        for (year = 1950; year <= 2050; year++){
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("El año " + year + " es bisiesto");
            }
        }
    }
}
