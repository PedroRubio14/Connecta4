
public class Ficha {

    public boolean colocarFicha (int columna,Jugador jugador,Tablero tablero){
        int fila = encontrarFilaDisponible(columna, tablero);
        if (fila == -1){
            System.out.print("ESTA COLUMNA ESTA LLENA");
            System.out.println();
            return false;
        }
        else {
            tablero.getTablero()[fila][columna] = jugador.getMiFicha();
            tablero.setTablero(tablero);
        }
        return true;

    }

    private int encontrarFilaDisponible (int columna, Tablero tablero){
        for(int i = tablero.getTablero().length-1;i>=0;i--){
            if(tablero.getTablero()[i][columna]==0){
                return i;
            }

        }
        return -1;
    }


}
