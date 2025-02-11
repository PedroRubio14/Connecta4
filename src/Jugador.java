import java. util. Scanner;

public class Jugador {
    static Scanner sc = new Scanner(System.in);
    private String nombre;
    private final char miFicha;


    public static Jugador nombreJugadorO(){
        System.out.println("Nombre del Jugador O: ");
        String nombreO = sc.nextLine();

        return new Jugador(nombreO,'O');
    }

    public static Jugador nombreJugadorX () {
        System.out.println("Nombre del Jugador X: ");
        String nombreX = sc.nextLine();

        return new Jugador(nombreX,'X');
    }





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
