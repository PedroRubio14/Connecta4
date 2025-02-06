import java. util. Scanner;

public class Juego {
    Scanner sc = new Scanner(System.in);

    public void nombreJugadores (){
        System.out.println("Nombre del Jugador X: ");
        String nombreX = sc.nextLine();
        Jugador jugadorX = new Jugador(nombreX,'X');
        System.out.println("Nombre del Jugador O: ");
        String nombreO = sc.nextLine();
        Jugador jugadorO = new Jugador(nombreO,'O');
    }
}
