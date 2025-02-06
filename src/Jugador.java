public class Jugador {
    private String nombre;
    private char miFicha;






    public Jugador(String nombre,char miFicha) {
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
}
