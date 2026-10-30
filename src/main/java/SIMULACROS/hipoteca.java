package SIMULACROS;
import java.util.InputMismatchException;
import java.util.Scanner;

public class hipoteca {
    public static void main(String[] args) {
        int prestamo = 0; //C
        double intereses = 0; //i
        int cuotas_ano = 12; //m
        int anyoInicio = 0;//n
        int anyoFinal = 0;//n
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Indica el dinero del prestamo: ");
            prestamo = sc.nextInt(); //Co
            System.out.println("Indica el porcentaje de intereses anuales: ");
            intereses = sc.nextDouble() / 100; //i
            cuotas_ano = 12; //m
            System.out.println("Indica el primer año de hipoteca: ");
            anyoInicio = sc.nextInt(); //n
            System.out.println("Indica el último año de hipoteca");
            anyoFinal = sc.nextInt();//n
        }
        catch (InputMismatchException e){
            System.out.println("Error: " + e.getMessage() + "Debes introducir datos validos");
            return;
        }
        double iMensual = intereses / cuotas_ano;

        System.out.println("-Prestamo: " + prestamo+"€" + " Interes anual: " + (intereses * 100) +"%" + " Rango de años: " + anyoInicio + " a " + anyoFinal);

        for (int n = anyoInicio; n <= anyoFinal; n++) {
            System.out.println("PLAZO DE: " + n + " AÑOS");
            //CUOTA MENSUAL
            int anyoCuotas = n * cuotas_ano;
            double potencia = Math.pow((1+iMensual),anyoCuotas);
            double formula = (potencia * iMensual) / (potencia - 1);
            double cuotaMensual = prestamo * formula;
            System.out.printf("Cuota mensual: %.2f €\n ", cuotaMensual);


            double cantidadPagada = cuotaMensual  * anyoCuotas;
            double iTotal = cantidadPagada - prestamo;
            double iTotalPorcentaje = (iTotal/prestamo) * 100;
            int totalPagos = n * cuotas_ano;

            System.out.printf("Interes total devuelto: %.2f € (supone un %.2f%% respecto a la cantidad pedida)\n", iTotal, iTotalPorcentaje);
            System.out.printf("Cantidad final pagada: %.2f €\n " , cantidadPagada );
            System.out.println("Numero total de pagos: " + totalPagos);

            }



        }
    }
