package ejerciciosPOO;

public class Producto {
    // Atributos
    private String nombre;
    private double precioBase;

    // Constructor para inicializar el objeto al crearlo
    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    // Método para calcular el precio con descuento (retorna el valor)
    public double aplicarDescuento(double porcentaje) {
        // La fórmula es: Precio Base * (1 - Porcentaje/100)
        double descuento = porcentaje / 100.0;
        double precioFinal = this.precioBase * (1.0 - descuento);

        // Retornamos el precio calculado
        return precioFinal;
    }

    // Método para mostrar el precio base
    public void mostrarPrecioBase() {
        System.out.println("Producto: " + this.nombre);
        System.out.println("Precio Base: " + String.format("%.2f", this.precioBase) + " €");
    }

    static void main(String[] args) {
        Producto monitor = new Producto("monitor", 250);
        monitor.mostrarPrecioBase();
        double precioConDescuento = monitor.aplicarDescuento(15);
        System.out.println("Nombre del producto: " + monitor.nombre + " \n Precio final con descuento del 15%: "+ precioConDescuento);
        monitor.mostrarPrecioBase();


    }
}

