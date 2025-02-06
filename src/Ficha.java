
public class Ficha {

    public void colocarFicha (int columna,Jugador jugador,Tablero tablero){
    tablero.getTablero()[encontrarFilaDisponible(columna,tablero)][columna] = jugador.getMiFicha();
    tablero.setTablero(tablero);

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
