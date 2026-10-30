package ej_condicionales;

import java.util.Scanner;

public class ej4_lluvia {
     static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.print("LLueve? True or false: ");
         boolean llueve=sc.nextBoolean();

         if (llueve == true){
             System.out.println("chubasquero");
         }
         else{
             System.out.println("gafas de sol");
         }
         sc.close();
    }
}
