package ejerciciosPOO;

public class circulo {
    //atributo radio del circulo
    private double radio;

    //METODO CONSTRUCTOR con un parámetro rad que se almacena en el atributo radio
    public circulo(double rad) {
        radio = rad;
    }

    //METODO que permite recuperar el valor del radio
    public double getradio() {
        return radio;
    }

    //MÉTODO que permite modificar el valor del radio
    public void setradio(double valor) {
        radio = valor;
    }

    //METODO que calcula el area del círculo
    public double area() {
        return Math.PI * radio * radio;
    }

    //METODO que calcula el diametro
    public double diametro() {
        return radio + radio;
    }

    //METODO que calcula el perímetro
    public double perimetro() {
        return 2 * radio * Math.PI;
    }

    //MÉTODO que calcula el area de un sector del ángulo pasado por parámetro de este círculo
    public double areaSector(double angulo) {
        return (angulo / 360) * radio * radio * Math.PI;
    }



    }


