package ejerciciosPOO;

public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;
    public Cafetera(){
        this.cantidadActual= 0;
        this.capacidadMaxima= 1000;
    }

    public Cafetera(int capacidadMaxima, int cantidadActual){
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
            if (cantidadActual > capacidadMaxima){
                this.cantidadActual = capacidadMaxima;
            }
            else{
                this.cantidadActual = cantidadActual;
            }
    }

    void llenarCafetera(){
        cantidadActual = 1000;
    }
    public int servirTaza(int capacidadTaza){
        int cantidadservida = 0;
       if (this.cantidadActual >= capacidadTaza){
           this.cantidadActual -= capacidadTaza;
           cantidadservida = capacidadTaza;
           System.out.println("Has servido: " + cantidadservida + " ml");
       }
       else{
           cantidadservida = this.cantidadActual;
           System.out.println("No habia suficiente café, solo hemos podido servir: " + cantidadservida);
           this.cantidadActual = 0;
       }
        System.out.println("Quedan en la cafetera: " + this.cantidadActual + " ml de café");
        return cantidadservida;
    }
    void vaciarCafetera(){
        cantidadActual = 0;
    }
    void agregarCafe(int cantidad){
        cantidadActual = cantidadActual + cantidad;
    }

    public int getCantidadActual() {
        System.out.println("Cantidad actual en la cafetera: " + cantidadActual);
        return cantidadActual;
    }
    public int getCapacidadMaxima(){
        System.out.println("Capacidad maxima de la cafetera: " + capacidadMaxima);
        return capacidadMaxima;
    }

    public static void main(String[] args) {
        Cafetera cafeteraCocina = new Cafetera(1200, 1200);
        Cafetera cafeteraDespacho = new Cafetera(500, 200);
        cafeteraCocina.agregarCafe(100);
        System.out.println("--- 1. Invocación de método void con entrada ---");
        cafeteraCocina.agregarCafe(100); // Pasamos 100 como dato de entrada
        System.out.println("Se invocó agregarCafe(100) en cafeteraCocina.");

        System.out.println("\n--- 2. Invocación con entrada y recogida de salida ---");
        int servido1 = cafeteraCocina.servirTaza(250); // Enviamos 250 y recogemos el int devuelto
        System.out.println("Dato de entrada enviado: 250 ml");
        System.out.println("Dato de salida recogido en la variable 'servido1': " + servido1);

        int servido2 = cafeteraDespacho.servirTaza(300); // Enviamos 300 y recogemos el int devuelto
        System.out.println("Dato de entrada enviado: 300 ml");
        System.out.println("Dato de salida recogido en la variable 'servido2': " + servido2);

        // 4. Invocación de métodos consultores (sin entradas, con salida)
        System.out.println("\n--- 3. Invocación de métodos consultores ---");
        int actualCocina = cafeteraCocina.getCantidadActual();
        int actualDespacho = cafeteraDespacho.getCantidadActual();

        System.out.println("Café en Cocina (recogido en 'actualCocina'): " + actualCocina + " ml");
        System.out.println("Café en Despacho (recogido en 'actualDespacho'): " + actualDespacho + " ml");
        System.out.println("-> Conclusión: Cada objeto mantiene su estado independiente en el Heap.");
    }
}