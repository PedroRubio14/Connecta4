import java. util. Scanner;

public class Juego {
    Scanner sc = new Scanner(System.in);

    public void partida(Tablero tablero){
        Juego j = new Juego();
        Jugador O = nombreJugadorO();
        Jugador X = nombreJugadorX();
        while (!laPartidaHaTerminado(esGanador(),empate(tablero))){
            tablero.mostrarTablero();
            ponerFicha(O,tablero);
            tablero.mostrarTablero();
            if (laPartidaHaTerminado(esGanador(),empate(tablero))){
                break;
            }
            ponerFicha(X,tablero);
            tablero.mostrarTablero();
        }
        System.out.print("La partida ha finalizado");

    }

    public Jugador nombreJugadorO (){
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

    private boolean empate (Tablero t){
        char [][] tablero = t.getTablero();
        if(!esGanador()) {
            for (int i = 0; i < tablero.length; i++) {
                for (int y = 0; y < tablero[i].length; y++) {
                    if (tablero[i][y] == 0) {
                        return false;
                    }
                }
            }
            System.out.println("EMPATE!!");
            return true;
        }
        return false;
    }



}
