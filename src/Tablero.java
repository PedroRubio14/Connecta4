public class Tablero {
    private char[][] tablero;
    private final int columnas = 7;
    private final int filas = 6;


    public Tablero (){
        tablero = new char [filas][columnas];
    }

    public char[][] getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero.getTablero();
    }



    protected static int encontrarFilaDisponible(int columna, Tablero tablero){
        for(int i = tablero.getTablero().length-1;i>=0;i--){
            if(tablero.getTablero()[i][columna]==0){
                return i;
            }

        }
        return -1;
    }





    public boolean HayGanador(Jugador jug) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (verificaDirecciones(i, j, 1, 0, jug.getMiFicha()) || // Horizontal
                        verificaDirecciones(i, j, 0, 1, jug.getMiFicha()) || // Vertical
                        verificaDirecciones(i, j, 1, 1, jug.getMiFicha()) || // Diagonal ↘
                        verificaDirecciones(i, j, 1, -1, jug.getMiFicha())) { // Diagonal ↙
                    return true;
                }
            }
        }
        return false;
    }

    private boolean verificaDirecciones(int row, int col, int dRow, int dCol, char ficha) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            int r = row + i * dRow;
            int c = col + i * dCol;
            if (r >= 0 && r < filas && c >= 0 && c < columnas && tablero[r][c] == ficha) {
                count++;
            } else {
                break;
            }
        }
        return count == 4;
    }


    protected boolean laPartidaHaTerminado (Tablero t,Jugador jo,Jugador jx){
        return esGanador(t, jo, jx) || empate(t, jo, jx);
    }



    private boolean esGanador (Tablero t,Jugador jo,Jugador jx){
        char [][] tablero = t.getTablero();

        return ganaX(jx) || ganaO(jo);
    }


    private boolean ganaX (Jugador j){
        if( HayGanador(j)){
            Textos.imprimir(Textos.Codigo.GANA,j);

            return true;
        }

        return false;
    }


    private boolean ganaO(Jugador j){
        if(HayGanador(j)){
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

}
