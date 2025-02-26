public class Ficha {

    public static void colocarFicha(Jugador jugador, Tablero tablero){

        boolean fichaPuesta = false;
        int columna;

        do {
            Textos.imprimir(Textos.Codigo.COLOCAR_FICHA, jugador);
            columna = Textos.llegirInt();
            if (columna < 0 || columna >= tablero.getTablero()[0].length){
                Textos.imprimir(Textos.Codigo.COLUMNA_NO_VALIDA,tablero);

            }else {
                Ficha f = new Ficha();

                int fila = tablero.encontrarFilaDisponible(columna, tablero);
                if (fila == -1){
                    Textos.imprimir(Textos.Codigo.COLUMNA_LLENA);
                }
                else {
                    tablero.getTablero()[fila][columna] = jugador.getMiFicha();
                    tablero.setTablero(tablero);
                    fichaPuesta = true;
                }



            }
        }while (!fichaPuesta);



    }




}
