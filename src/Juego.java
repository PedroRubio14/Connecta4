import java. util. Scanner;

public class Juego {
    Scanner sc = new Scanner(System.in);

    public void partida(Tablero tablero){
        Juego j = new Juego();
        Jugador O = nombreJugadorO();
        Jugador X = nombreJugadorX();

        while (!laPartidaHaTerminado(tablero,O,X)){
            tablero.mostrarTablero();
            ponerFicha(O,tablero);
            tablero.mostrarTablero();

            if (laPartidaHaTerminado(tablero,O,X)){
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


    private boolean laPartidaHaTerminado (Tablero t,Jugador jo,Jugador jx){
        return esGanador(t, jo, jx) || empate(t, jo, jx);
    }


    private boolean esGanador (Tablero t,Jugador jo,Jugador jx){
        char [][] tablero = t.getTablero();

        return ganaX(tablero,jx) || ganaO(tablero,jo);
    }


    private boolean ganaX (char [][] t,Jugador j){
        if(filaGanadora(j.getMiFicha(),t) ||columnaGanadora (j.getMiFicha(),t) || ganadorDiagonal(j.getMiFicha(),t) ){
            System.out.println("HA GANADO "+j.getNombre()+"!!");

            return true;
        }

        return false;
    }


    private boolean ganaO(char [][] t, Jugador j){
        if(filaGanadora(j.getMiFicha(),t) ||columnaGanadora (j.getMiFicha(),t) || ganadorDiagonal(j.getMiFicha(),t) ){
            System.out.println("HA GANADO "+j.getNombre()+"!!");

            return true;
        }
        return false;

    }



    private boolean empate (Tablero t,Jugador jo,Jugador jx){
        char [][] tablero = t.getTablero();

        if(!esGanador(t, jo, jx)) {
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

    private boolean filaGanadora(char ficha, char [][] t){
        for(int i =0; i < t.length; i++){
            for (int y = 0; y<t[i].length-3;y++){
                if(t[i][y]==ficha&&t[i][y+1]==ficha&&t[i][y+2]==ficha&&t[i][y+3]==ficha){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean columnaGanadora(char ficha, char [][] t){

    return false;

}
private boolean ganadorDiagonal(char ficha, char [][] t){
    return false;

}

}
