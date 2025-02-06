public class Ficha {

    public void colocarFicha (int columna, Jugador jugador,char [][] tablero){
    tablero[enonctrarFilaDisponible(columna,tablero)][columna] = jugador.();

    }

    private int enonctrarFilaDisponible (int columna, char [][] tablero){
        for(int i = tablero.length-1;i>0;i--){
            if(tablero[i][columna]==0){
                return i;
            }

        }
        return -1;
    }
}
