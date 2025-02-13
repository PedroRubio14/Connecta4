public class Juego {

    public void partida(Tablero tablero){
        Juego j = new Juego();
        Jugador O = new Jugador("",'O');
        Jugador X = new Jugador("",'X');



        Jugador.nombreJugadores(O);
        Jugador.nombreJugadores(X);

        tablero.mostrarTablero();

        while (!laPartidaHaTerminado(tablero,O,X)){
            Ficha.colocarFicha(O,tablero);
            tablero.mostrarTablero();

            if (laPartidaHaTerminado(tablero,O,X)){
                break;
            }

            Ficha.colocarFicha(X,tablero);
            tablero.mostrarTablero();
        }
        Textos.imprimir(Textos.Codigo.PARTIDA_FINALIZADA);

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
            Textos.imprimir(Textos.Codigo.GANA,j);

            return true;
        }

        return false;
    }


    private boolean ganaO(char [][] t, Jugador j){
        if(filaGanadora(j.getMiFicha(),t) ||columnaGanadora (j.getMiFicha(),t) || ganadorDiagonal(j.getMiFicha(),t) ){
            Textos.imprimir(Textos.Codigo.GANA,j);

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

            Textos.imprimir(Textos.Codigo.EMPATE);
            return true;

        }
        return false;
    }

    private boolean filaGanadora(char ficha, char [][] t){
        for(int i =0; i < t.length; i++){
            for (int y = 0; y<t[i].length-3;y++){
                if(t[i][y] == ficha && t[i][y+1] == ficha && t[i][y+2] == ficha && t[i][y+3] == ficha){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean columnaGanadora(char ficha, char [][] t){
        for(int i = 0; i<t[0].length;i++){
            for(int y =0; y<t.length-3;y++){
                if(t[y][i] == ficha && t[y+1][i] == ficha && t[y+2][i] == ficha && t[y+3][i] == ficha){
                    return true;
                }

            }
        }

    return false;

    }
private boolean ganadorDiagonal(char ficha, char [][] t){
    return diagonalIzquierda(ficha, t) || digonalDerecha(ficha, t);

}

private boolean diagonalIzquierda(char ficha, char[][] t){

    for (int y = 0; y < t.length-3; y++) {
        for (int x = 0; x <t[0].length-3; x++) {
            if (t[y][x] == ficha && t[y+1][x+1] == ficha && t[y+2][x+2] == ficha && t[y+3][x+3] == ficha) {
                return true;
            }
        }
    }
    return false;

}
private boolean digonalDerecha (char ficha, char[][] t){
    for (int y = 3; y < t.length; y++) {
        for (int x = 0; x < t[0].length - 3; x++) {
            if (t[y][x] == ficha && t[y-1][x+1] == ficha && t[y-2][x+2] == ficha && t[y-3][x+3] == ficha) {
                return true;
            }
        }
    }

    return false;
}

}
