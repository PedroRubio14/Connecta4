public class Jugador {
    private String nombre;
    public char miFicha;



    public static void nombreJugadores(Jugador j){
        Textos.imprimir(Textos.Codigo.NOMBRE,j);
        j.setNombre(Textos.llegirString());

    }


    public Jugador(String nombre, char miFicha) {
        this.nombre = nombre;
        this.miFicha = miFicha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getMiFicha() {
        return miFicha;
    }

    public void setMiFicha(char miFicha) {
        this.miFicha = miFicha;
    }
}
