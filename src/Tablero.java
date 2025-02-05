public class Tablero {
    private int filas = 7;
    private int columnas = 6;
    public char[][] tablero;

    public Tablero (int filas, int columnas){
        tablero = new char [filas][columnas];
    }

    public void mostrarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int y = 0; y < tablero[i].length; y++) {
                System.out.print("[" + tablero[i][y] + "]");
            }
            System.out.println();
        }
    }




}
