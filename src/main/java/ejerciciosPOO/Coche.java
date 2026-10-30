package ejerciciosPOO;

public class Coche {
    // Atributos
    private String marca;
    private String modelo;
    private int velocidad = 0; // Inicializada en 0

    // Constructor para inicializar marca y modelo al crear el objeto
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método para aumentar la velocidad
    public void acelerar() {
        this.velocidad += 10;
        System.out.println(this.modelo + " acelera. Velocidad actual: " + this.velocidad + " km/h.");
    }

    // Método para reducir la velocidad
    public void frenar() {
        this.velocidad -= 5;
        // Aseguramos que la velocidad nunca sea negativa
        if (this.velocidad < 0) {
            this.velocidad = 0;
        }
        System.out.println(this.modelo + " frena. Velocidad actual: " + this.velocidad + " km/h.");
    }

    // Método para mostrar el estado actual
    public void mostrarEstado() {
        System.out.println("\n--- Estado del Coche ---");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Velocidad: " + this.velocidad + " km/h");
        System.out.println("------------------------");
    }

    static void main(String[] args) {
        Coche miCoche = new Coche("Toyota", "Corolla");
        for (int i = 1; i <= 3; i++){
            miCoche.acelerar();
        }
        for (int fr = 1; fr <= 6; fr++){
            miCoche.frenar();
        }

        miCoche.frenar();
        miCoche.mostrarEstado();


    }
}

