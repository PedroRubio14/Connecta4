public class Ficha {

    public void colocarFicha (int columna, Jugador jugador,Tablero tablero){


    }

    private int enonctrarFilaDisponible (int columna, char [][] tablero){
        for(int i = tablero.length-1;i>0;i--){
            if(tablero[i][columna]==0){
                return i;
            }

        }

    }
}
