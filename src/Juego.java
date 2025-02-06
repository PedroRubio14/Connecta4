import java. util. Scanner;

public class Juego {
    Scanner sc = new Scanner(System.in);

    public void partida(Tablero tablero){
        while (laPartidaHaTerminado())
        Juego j = new Juego();

    }

    public Jugador nombreJugadorO (){
        System.out.println("Nombre del Jugador X: ");
        String nombreX = sc.nextLine();
        Jugador jugadorX = new Jugador(nombreX,'X');
        System.out.println("Nombre del Jugador O: ");
        String nombreO = sc.nextLine();
        Jugador jugadorO = new Jugador(nombreO,'O');

        return jugadorO;
    }
    public Jugador nombreJugadorX () {
        System.out.println("Nombre del Jugador X: ");
        String nombreX = sc.nextLine();
        Jugador jugadorX = new Jugador(nombreX, 'X');
        return jugadorX;
    }

    private void ponerFicha (Jugador jugador,Tablero tablero){
        System.out.println("Donde quieres colocar tu ficha "+jugador.getNombre()+" ?");
        int columna = sc.nextInt();
        Ficha f = new Ficha();
        f.colocarFicha(columna,jugador,tablero);
    }

    private boolean laPartidaHaTerminado (boolean esGanador, boolean empate){
        if ( esGanador || empate){
            return true;
        }
        return false;
    }

    private boolean esGanador (){
        return false;
    }

    private boolean empate (){
        return false;
    }

}
