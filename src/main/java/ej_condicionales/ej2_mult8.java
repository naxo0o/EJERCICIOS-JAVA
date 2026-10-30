package ej_condicionales;

import java.util.Scanner;

public class ej2_mult8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int n=sc.nextInt();
        if (n % 8 == 0){
            System.out.println(n + " es multiplo de 8");
        }
        else {
            System.out.println(n + " no es multiplo de 8");
        }
        sc.close();
    }
}
