public class Juego {

    public void partida(Tablero tablero){
        Juego j = new Juego();
        Jugador O = new Jugador("");
        Jugador X = new Jugador("");



        Jugador.nombreJugadores(O);
        Jugador.nombreJugadores(X);

        Textos.mostrarTablero(tablero);

        while (!tablero.laPartidaHaTerminado(tablero,O,X)){
            Ficha.colocarFicha(O,tablero);
            Textos.mostrarTablero(tablero);

            if (tablero.laPartidaHaTerminado(tablero,O,X)){
                break;
            }

            Ficha.colocarFicha(X,tablero);
            Textos.mostrarTablero(tablero);
        }
        Textos.imprimir(Textos.Codigo.PARTIDA_FINALIZADA);

    }




}
