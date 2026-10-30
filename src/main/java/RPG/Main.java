package RPG;

public class Main {
    public static void main(String[] args) {
        Personaje heroe = new Personaje("Alucard", 100, 50, 5);
        orco enemigo = new orco();

        System.out.println(heroe.toString());
        heroe.attack(enemigo);
        enemigo.attack(heroe);
        System.out.println(heroe.toString());
        System.out.println(enemigo.toString());

    }


}
