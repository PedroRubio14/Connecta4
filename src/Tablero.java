public class Tablero {
    public char[][] tablero;

    public Tablero (int filas, int columnas){
        tablero = new char [filas][columnas];
    }

    public char[][] getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero.getTablero();
    }
}
