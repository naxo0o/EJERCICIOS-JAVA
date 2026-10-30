package ejerciciosPOO;

public class principal {
    public static void main(String[] args) {
        circulo micirculo = new circulo(5.0);
        System.out.println("Area del circulo: " + micirculo.area());
        System.out.println("Perimetro del circulo: " + micirculo.perimetro());
        System.out.println("Diametro del circulo: "+ micirculo.diametro());
        System.out.println("Area del sector de angulo 85º: " + micirculo.areaSector(85));

        circulo circulodos = new circulo(20);
        System.out.println("Area del circulo 2: " + circulodos.area());
        System.out.println("Perimetro del circulo 2: " + circulodos.perimetro());
        System.out.println("Diametro del circulo 2: "+ circulodos.diametro());
        System.out.println("Sector de angulo 2 110º: " + circulodos.areaSector(110));
        System.out.println("Sector de angulo 2 90º: " + circulodos.areaSector(90));
        circulodos.setradio(12);
        System.out.println("Nueva area del circulo 2: " + circulodos.area());

    }
}
