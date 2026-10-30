package SIMULACROS;
import java.util.Scanner;
import java.util.Random;

public class mascarillas {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la farmacia \n");
        Random generador =  new Random();
        Scanner sc = new Scanner(System.in);
        final int MAXIMO = 1000;
        final int MINIMO = 50;
        int higienicas = generador.nextInt(MAXIMO - MINIMO + 1) + MINIMO;
        int quirurgicas = generador.nextInt(MAXIMO - MINIMO + 1) + MINIMO;
        int ffp2= generador.nextInt(MAXIMO - MINIMO + 1) + MINIMO;
        int ffp3= generador.nextInt(MAXIMO - MINIMO + 1) + MINIMO;
        System.out.println("Higiénicas: " + higienicas);
        System.out.println("Quirúrgicas: " + quirurgicas);
        System.out.println("FFP2: " + ffp2);
        System.out.println("FFP3: " + ffp3);
        int total = higienicas + ffp2 + ffp3 + quirurgicas;
        int opcion;



        //MAYOR
        int maximo = higienicas;
        String tipoMaximo = "Higienicas";

        if (quirurgicas > maximo) {
            maximo = quirurgicas;
            tipoMaximo = "Quirurgicas";
        }
        if (ffp2 > maximo) {
            maximo = ffp2;
            tipoMaximo = "FFP2";
        }
        if (ffp3 > maximo) {
            maximo = ffp3;
            tipoMaximo = "ffp3";
        }

        //MINIMO

        int minimo = higienicas;
        String tipoMinimo = "Higienicas";

        if (quirurgicas < minimo) {
            minimo = quirurgicas;
            tipoMinimo = "Quirurgicas";
        }
        if (ffp2 < minimo) {
            minimo = ffp2;
            tipoMinimo = "FFP2";
        }
        if (ffp3 < minimo) {
            minimo = ffp3;
            tipoMinimo = "ffp3";
        }

        do {
            System.out.println("1.Ver el pedido más grande");
            System.out.println("2.Total de mascarillas pedidas");
            System.out.println("3.Ver el pedido más pequeño");
            System.out.println("4.Salir");
            System.out.println("Elige una opción del menú: ");


            opcion = sc.nextInt();
            switch (opcion) {
            case 1:
                System.out.println("Pedido mas alto: " + maximo + " mascarillas tipo " + tipoMaximo +"\n");
                break;
            case 2:
                System.out.println("La suma de todos los pedidos es: " + total + " mascarillas \n");
                break;
            case 3:
                System.out.println("Pedido mas pequeño: " + minimo + " mascarillas tipo " + tipoMinimo + "\n");
                break;
            case 4:
                System.out.println("Saliendo del sistema... \n");
                break;
            default:
                System.out.println("Opción no valida \n");
            }
        }
        while (opcion != 4);





    }
}
