package ej_switches;

public class ej1_diasemana {
    static void main(String[] args) {
        int diaSemana = 3;
        String nombreDia = "";
        switch (diaSemana) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                    nombreDia = "Miercoles";
                    break;
            case 4:
                    nombreDia = "Jueves";
                    break;
            case 5:

                    nombreDia = "Viernes";
                    break;
            case 6:
                nombreDia = "Sabado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
        default:
            System.out.println("No existen mas días");
            break;
        }
        System.out.println("Hoy es " + nombreDia);

    }
}
