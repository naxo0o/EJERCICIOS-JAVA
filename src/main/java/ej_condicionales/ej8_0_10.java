package ej_condicionales;

import java.util.Scanner;

public class ej8_0_10 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota = sc.nextInt();
        if (nota <= 10 && nota >= 0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
