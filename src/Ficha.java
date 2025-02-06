public class Ficha {

    public void colocarFicha (int columna,char x /*Jugador jugador*/,Tablero tablero){
    tablero.getTablero()[encontrarFilaDisponible(columna,tablero)][columna] = x;//aun no terminado, hay que implementar jugador

    }

    private int encontrarFilaDisponible (int columna, Tablero tablero){
        for(int i = tablero.getTablero().length-1;i>0;i--){
            if(tablero.getTablero()[i][columna]==0){
                return i;
            }

        }
        return -1;
    }
}
