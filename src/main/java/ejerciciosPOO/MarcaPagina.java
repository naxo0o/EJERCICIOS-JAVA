package ejerciciosPOO;

public class MarcaPagina {
    private int ultimaPagina;

    public MarcaPagina() {
        ultimaPagina = 1;
    }

    int ultimaPaginaLeida() {
        return ultimaPagina;
    }
    void siguientePag(int cantidad) {
        ultimaPagina ++;
    }

    void comenzar() {
        ultimaPagina = 1;
    }

    static void main(String[] args) {
        MarcaPagina mimarcapaginas = new MarcaPagina();
        for (int i = 1; i <= 15; i++){
            mimarcapaginas.siguientePag(i);
        }
        System.out.println("Pagina actual: " + mimarcapaginas.ultimaPaginaLeida());
        mimarcapaginas.comenzar();
        System.out.println("Comenzar de nuevo el libro, pagina: " + mimarcapaginas.ultimaPaginaLeida());

    }
}