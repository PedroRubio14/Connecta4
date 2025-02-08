
public class Ficha {

    public void colocarFicha (int columna,Jugador jugador,Tablero tablero){
        try {
            int fila = encontrarFilaDisponible(columna, tablero);
            if (fila == -1){
                System.out.print("ESTA COLUMNA ESTA LLEANA");
                System.out.println();

            }
            else {
                tablero.getTablero()[fila][columna] = jugador.getMiFicha();
                tablero.setTablero(tablero);
            }

        }catch(IndexOutOfBoundsException e){
            System.out.println("Error: La columna no es válida. Elige una entre 0 y " + (tablero.getTablero()[0].length - 1));


        }

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
