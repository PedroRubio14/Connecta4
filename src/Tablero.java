public class Tablero {
    public char[][] tablero;

    public Tablero (int filas, int columnas){
        tablero = new char [filas][columnas];
    }

    public void mostrarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int y = 0; y < tablero[i].length; y++) {
                if(tablero[i][y]==0){
                    System.out.print("[ ]");
                }else {
                    System.out.print("[" + tablero[i][y] + "]");
                }
            }
            System.out.println();
        }
        for(int i = 0;i<tablero[0].length;i++){
            System.out.print(" "+i+" ");
        }
        System.out.println();
        System.out.println();
    }

    public char[][] getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero.getTablero();
    }
}
