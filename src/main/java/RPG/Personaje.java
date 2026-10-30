package RPG;

import java.util.Random;

public class Personaje {
    private String name;
    private int life;
    private int endurance;
    private int damage;


    public Personaje(String name, int life, int endurance, int damage){
        this.name = name;
        this.life = life;
        this.endurance = endurance;
        this.damage = damage;
    }
    @Override
    public String toString() {
        return "Personaje: " + this.name + " | Vida: " + this.life + " | Aguante: " + this.endurance +  " | Daño: " + this.damage;
    }

    public Personaje(String name){
        this(name, 100, 50, 5);
    }

    public void attack(Personaje enemy){
        if (this.endurance >= 5){
            this.endurance -= 5;
            enemy.takeDamage(this.damage);
            System.out.println("El enemigo tiene: " +  enemy.getLife() +  " puntos de vida");
        }
        else {
            System.out.println("No tienes suficiente aguante");
        }
    }

    public void takeDamage(int damageReceived){
        this.life -= damageReceived;
        if (this.life <= 0){
            this.life = 0;
            System.out.println("El personaje ha muerto");
        }
        else{
            System.out.println(this.name + " ha recibido: " + damageReceived + " puntos de daño");
        }
    }

    public void curar(int cantidad){
        int vidaAnterior = this.life;
            if (this.life > 0 && this.life < 100){
                this.life += cantidad;
                if (this.life > 100){
                    this.life = 100;
                }
                int vidaActual = this.life - vidaAnterior;
                System.out.println("El personaje se ha curado "+vidaActual+ " puntos de vida");
            }
            else {
                if (this.life == 0){
                    System.out.println("Tu personaje está muerto");
                }
                else {
                    System.out.println("Vida maxima");
                }
            }

    }





    //PUBLICA

;    //GET
    public String getName(){
        return this.name;
    }
    public int getLife(){
        return this.life;
    }
    public int getEndurance(){
        return this.endurance;
    }
    public int getDamage(){
        return this.damage;
    }

    //Validación de entorno
        public boolean estaVivo(){
        if (this.life <= 0){
            return false;
        }
        else {
            return true;
        }
    }



}
