package ejerciciosPOO;

public class Estudiante {
    // Atributos
    private String nombre;
    private int edad;
    private double notaMedia;

    // Constructor para inicializar todos los atributos
    public Estudiante(String nombre, int edad, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }

    // Método que RETORNA la nota media (double)
    public double obtenerMedia() {
        return this.notaMedia;
    }

    // Método que RETORNA un booleano
    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }

    // Método para mostrar los datos
    public void mostrarDatos() {
        System.out.println("\n--- Datos del Estudiante ---");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad + " años");
        System.out.println("Nota Media: " + this.notaMedia);
    }

    static void main(String[] args) {
        Estudiante alumno = new Estudiante("Nacho", 18, 8.7);
        alumno.mostrarDatos();
        alumno.obtenerMedia();
        double mediaAlumno = alumno.obtenerMedia();
        System.out.println(mediaAlumno);
        alumno.esMayorDeEdad();
        boolean edad = alumno.esMayorDeEdad();
        if (edad == true){
            System.out.println("Es mayor de edad");
        }
        else {
            System.out.println("Es menor de edad");
        }


    }
}

